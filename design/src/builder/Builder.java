package builder;

import abstract_factory.Interface.Sender;
import abstract_factory.Interface.impl.MailSender;
import abstract_factory.Interface.impl.SmsSender;

import java.util.ArrayList;
import java.util.List;

/**
 * Title: Builder类<br>
 * Description:
 * Company: 安阳师范学院
 *
 * @author 曹涛
 * @version 1.0
 */
public class Builder {
    private List<Sender> list = new ArrayList<>();

    public void produceMailSender(int count) {
        for (int i = 0; i < count; i++) {
            list.add(new MailSender());
        }
        System.out.println(list);
    }
    public void produceSmsSender(int count) {
        for (int i = 0; i < count; i++) {
            list.add(new SmsSender());
        }
        System.out.println(list);
    }

}
