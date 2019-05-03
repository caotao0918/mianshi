package service;

import javax.xml.ws.Endpoint;

/**
 * Title: WebServicePublish类<br>
 * Description:
 * Company: 安阳师范学院
 *
 * @author 曹涛
 * @version 1.0
 */
public class WebServicePublish {
    public static void main(String[] args) {
        String address = "http://localhost:8089/webservice";
        Endpoint.publish(address,new WebServiceImpl());
        System.out.println("发布成功。。。");
    }
}
