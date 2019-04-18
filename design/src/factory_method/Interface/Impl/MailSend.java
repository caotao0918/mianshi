package factory_method.Interface.Impl;

import factory_method.Interface.Send;

/**
 * Title: MailSend类<br>
 * Description:
 * Company: 安阳师范学院
 *
 * @author 曹涛
 * @version 1.0
 */
public class MailSend implements Send {

    @Override
    public void send() {
        System.out.println("this is mail");
    }
}
