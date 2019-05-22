package com.caotao;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.document.Document;
import org.apache.lucene.document.Field;
import org.apache.lucene.document.TextField;
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
 * Title: LuceneManager类<br>
 * Description:
 * Company: 卓瀛工作室
 *
 * @author 曹涛
 * @version 1.0
 */
public class LuceneManager {

    public IndexWriter indexWriter() throws IOException {
        Analyzer analyzer = new IKAnalyzer();//官方标准分词器
        IndexWriterConfig config = new IndexWriterConfig(Version.LATEST,analyzer);
        Directory directory = FSDirectory.open(new File("E:\\ideaworkspace\\mianshi\\lucene\\index"));//索引库
        return new IndexWriter(directory,config);
    }
    public IndexSearcher searcher() throws Exception {
        Directory directory = FSDirectory.open(new File("E:\\ideaworkspace\\mianshi\\lucene\\index"));
        IndexReader reader = DirectoryReader.open(directory);
        return new IndexSearcher(reader);
    }
    public void printResult(IndexSearcher searcher,Query query) throws Exception {
        TopDocs topDocs = searcher.search(query, 9);
        ScoreDoc[] scoreDocs = topDocs.scoreDocs;
        for (ScoreDoc doc : scoreDocs) {
            int id = doc.doc;
            Document document = searcher.doc(id);
            String filename = document.get("filename");
            String path = document.get("path");
            String size = document.get("size");
            String content = document.get("content");
            System.out.println(filename + "--" + path + "--" + size + "--" + content);
            System.out.println("---------------");
        }
    }

    //删除索引
    @Test
    public void deleteIndex() throws IOException {
        IndexWriter writer = indexWriter();
        //全部删除
//        writer.deleteAll();
        //根据域名和索引删除
        writer.deleteDocuments(new TermQuery(new Term("content","apache")));//删除域名为content的apache索引
        writer.close();
    }

    //修改索引(不理解)
    @Test
    public void updateIndex() throws IOException {
        IndexWriter writer = indexWriter();
        Document document = new Document();
        document.add(new TextField("content","coffee", Field.Store.YES));
        writer.updateDocument(new Term("content","java"),document);
        writer.close();
    }
    //查询所有索引目录
    @Test
    public void searchAll() throws Exception {
        IndexSearcher searcher = searcher();
        Query query = new MatchAllDocsQuery();
        printResult(searcher,query);
        searcher.getIndexReader().close();

    }
    //根据范围查询
    @Test
    public void searchRange() throws Exception {
        IndexSearcher searcher = searcher();
        Query query = NumericRangeQuery.newLongRange("size",70L,300L,true,true);
        printResult(searcher,query);
        searcher.getIndexReader().close();
    }
    //组合查询
    @Test
    public void booleanQuery() throws Exception {
        IndexSearcher searcher = searcher();
        BooleanQuery query = new BooleanQuery();
        Query query1 = new TermQuery(new Term("filename","apache"));
        Query query2 = new TermQuery(new Term("content","曹涛"));
        Query query3 = NumericRangeQuery.newLongRange("size",300L,3000L,true,true);
        query.add(query1, BooleanClause.Occur.SHOULD);
        query.add(query2, BooleanClause.Occur.MUST);
        query.add(query3, BooleanClause.Occur.MUST_NOT);
        printResult(searcher,query);
        searcher.getIndexReader().close();
    }

}
