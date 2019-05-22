package com.caotao;

import org.apache.commons.io.FileUtils;
import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.document.*;
import org.apache.lucene.index.*;
import org.apache.lucene.search.*;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.FSDirectory;
import org.apache.lucene.util.Version;
import org.junit.Test;
import org.wltea.analyzer.lucene.IKAnalyzer;

import java.io.File;
import java.io.IOException;

/**
 * Title: FirstLucene类<br>
 * Description: Lucene入门  创建索引  查询索引
 * Company: 卓瀛工作室
 *
 * @author 曹涛
 * @version 1.0
 */
public class FirstLucene {
    @Test
    public void testLucene() throws IOException {
        //创建索引
        Analyzer analyzer = new IKAnalyzer();//中文标准分词器
        IndexWriterConfig config = new IndexWriterConfig(Version.LATEST,analyzer);
        Directory directory = FSDirectory.open(new File("E:\\ideaworkspace\\mianshi\\lucene\\index"));//索引库
        IndexWriter writer = new IndexWriter(directory,config);
        File f = new File("E:\\ideaworkspace\\mianshi\\lucene\\source");
        File[] files = f.listFiles();
        for (File file : files) {
            Document document = new Document();
            String fileName = file.getName();
            Field filenameField = new TextField("filename",fileName, Field.Store.YES);
            String path = file.getPath();
            Field pathField = new StoredField("path",path);
            long size = FileUtils.sizeOf(file);
            Field sizeField = new LongField("size",size, Field.Store.YES);
            String content = FileUtils.readFileToString(file);
            Field contentField = new TextField("content",content, Field.Store.YES);
            document.add(filenameField);
            document.add(pathField);
            document.add(sizeField);
            document.add(contentField);
            writer.addDocument(document);
        }
        writer.close();
    }

    //查询索引
    @Test
    public void testSearch() throws IOException {
        Directory directory = FSDirectory.open(new File("E:\\ideaworkspace\\mianshi\\lucene\\index"));
        IndexReader reader = DirectoryReader.open(directory);
        IndexSearcher searcher = new IndexSearcher(reader);
        Term term = new Term("content","java");
        Query query = new TermQuery(term);
        TopDocs docs = searcher.search(query, 5);
        ScoreDoc[] scoreDocs = docs.scoreDocs;
        /*SimpleHTMLFormatter simpleHTMLFormatter = new SimpleHTMLFormatter("<b><font color=red>","</font></b>"); //如果不指定参数的话，默认是加粗，即<b><b/>
        QueryScorer scorer = new QueryScorer(query);//计算得分，会初始化一个查询结果最高的得分
        Fragmenter fragmenter = new SimpleSpanFragmenter(scorer); //根据这个得分计算出一个片段
        Highlighter highlighter = new Highlighter(simpleHTMLFormatter, scorer);
        highlighter.setTextFragmenter(fragmenter); //设置一下要显示的片段*/
        for (ScoreDoc doc : scoreDocs) {
            int i = doc.doc;
            Document document = searcher.doc(i);
            String filename = document.get("filename");
            String path = document.get("path");
            String size = document.get("size");
            String content = document.get("content");
            System.out.println(filename + "--" + path + "--" + size + "--" + content);
            System.out.println("---------------");
        }
        reader.close();

    }
}
