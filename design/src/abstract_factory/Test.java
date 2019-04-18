package abstract_factory;

import abstract_factory.Interface.Provider;
import abstract_factory.Interface.Sender;
import abstract_factory.factory.MailFactory;

/**
 * Title: Test类<br>
 * Description:
 * Company: 安阳师范学院
 *
 * @author 曹涛
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Provider provider = new MailFactory();
        Sender sender = provider.produce();
        sender.send();
    }
}
