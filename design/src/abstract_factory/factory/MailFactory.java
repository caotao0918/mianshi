package abstract_factory.factory;

import abstract_factory.Interface.Provider;
import abstract_factory.Interface.Sender;
import abstract_factory.Interface.impl.MailSender;

/**
 * Title: MailFactory类<br>
 * Description:
 * Company: 安阳师范学院
 *
 * @author 曹涛
 * @version 1.0
 */
public class MailFactory implements Provider {
    @Override
    public Sender produce() {
        return new MailSender();
    }
}
