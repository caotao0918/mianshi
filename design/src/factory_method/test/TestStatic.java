package factory_method.test;

import factory_method.Interface.Send;
import factory_method.Static.SendFactory;

/**
 * Title: TestStatic类<br>
 * Description:
 * Company: 安阳师范学院
 *
 * @author 曹涛
 * @version 1.0
 */
public class TestStatic {
    public static void main(String[] args) {
        Send send = SendFactory.produceMail();
        send.send();
    }
}
