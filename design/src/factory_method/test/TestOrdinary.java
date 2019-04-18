package factory_method.test;

import factory_method.Interface.Send;
import factory_method.ordinary.SendFactory;

/**
 * Title: TestOrdinary类<br>
 * Description:
 * Company: 安阳师范学院
 *
 * @author 曹涛
 * @version 1.0
 */
public class TestOrdinary {
    public static void main(String[] args) {
        SendFactory factory = new SendFactory();
        Send send = null;
        send = factory.produce("mail");
        send.send();//this is mail
        send = factory.produce("111");
        send.send();//error     java.lang.NullPointerException
    }
}
