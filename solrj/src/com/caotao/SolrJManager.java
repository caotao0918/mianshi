package com.caotao;

import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.HttpSolrServer;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;
import org.apache.solr.common.SolrInputDocument;
import org.junit.Test;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * Title: SolrJManager类<br>
 * Description: SolrJ管理
 * Company: 卓瀛工作室
 *
 * @author 曹涛
 * @version 1.0
 */
public class SolrJManager {
    //增加
    @Test
    public void add() throws IOException, SolrServerException {
        SolrServer solrServer = new HttpSolrServer("http://localhost:8080/solr/");
        SolrInputDocument doc = new SolrInputDocument();
        doc.setField("id","164804179");
        doc.setField("name","曹涛");
        solrServer.add(doc);
        solrServer.commit();
    }
    //删除
    @Test
    public void delete() throws IOException, SolrServerException {
        SolrServer solrServer = new HttpSolrServer("http://localhost:8080/solr/");
        solrServer.deleteByQuery("*:*",8000);
    }
    //修改
    @Test
    public void update() {
        //与添加相同,id相同就是修改
    }
    //查询
    @Test
    public void query() throws SolrServerException {
        SolrServer solrServer = new HttpSolrServer("http://localhost:8080/solr/collection1");
        SolrQuery solrQuery = new SolrQuery();
        solrQuery.setQuery("*:*");
        QueryResponse queryResponse = solrServer.query(solrQuery);
        SolrDocumentList results = queryResponse.getResults();
        Map<String, Map<String, List<String>>> highlighting = queryResponse.getHighlighting();
        long numFound = results.getNumFound();
        System.out.println("查找到的数量：" + numFound);
        solrQuery.setStart(1);
        solrQuery.setRows(1);
        long start = results.getStart();
        System.out.println("从" + start + "开始");
//        solrQuery.addSort("id", SolrQuery.ORDER.asc);
        solrQuery.set("fl","name");

        //高亮
        solrQuery.setHighlight(true);
        solrQuery.addHighlightField("title");
        //前缀
        solrQuery.setHighlightSimplePre("<span style='color:red'>");
        //后缀
        solrQuery.setHighlightSimplePost("</span>");

        for (SolrDocument result : results) {
            System.out.println(result.get("id"));
            System.out.println(result.get("title"));
            System.out.println(result.get("p_pnum"));
            System.out.println(result.get("name"));
            System.out.println("---------------------");
            /*Map<String, List<String>> listMap = highlighting.get(result.get("id"));
            List<String> list = listMap.get("title");
            String s = list.get(0);
            System.out.println(s);*/

        }
    }

}
