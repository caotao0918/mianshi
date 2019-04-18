package factory_method.ordinary;

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
    public Send produce(String type) {
        if (type.equals("mail"))
            return new MailSend();
        else if (type.equals("sms"))
            return new SmsSend();
        else {
            System.out.println("error");
            return null;
        }
    }
}
