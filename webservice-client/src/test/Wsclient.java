package test;

import service.WebServiceImpl;
import service.WebServiceImplService;

/**
 * Title: Wsclient类<br>
 * Description:
 * Company: 安阳师范学院
 *
 * @author 曹涛
 * @version 1.0
 */
public class Wsclient {
    public static void main(String[] args) {
        WebServiceImplService factory = new WebServiceImplService();
        WebServiceImpl service = factory.getWebServiceImplPort();
        String s = service.sayHello("曹涛");
        System.out.println(s);
    }
}
