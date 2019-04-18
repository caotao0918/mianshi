package factory_method.Static;

import factory_method.Interface.Impl.MailSend;
import factory_method.Interface.Impl.SmsSend;
import factory_method.Interface.Send;

/**
 * Title: SendFactory类<br>
 * Description:
 * Company: 安阳师范学院
 *
 * @author 曹涛
 * @version 1.0
 */
public class SendFactory {
    public static Send produceMail() {
        return new MailSend();
    }
    public static Send produceSms () {
        return new SmsSend();
    }
}
