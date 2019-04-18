package abstract_factory.Interface.impl;

import abstract_factory.Interface.Sender;

/**
 * Title: MailSender类<br>
 * Description:
 * Company: 安阳师范学院
 *
 * @author 曹涛
 * @version 1.0
 */
public class MailSender implements Sender {
    @Override
    public void send() {
        System.out.println("this is mail");
    }
}
