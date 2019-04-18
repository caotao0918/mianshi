package observer;

import observer.Interface.impl.AbstractSubject;

/**
 * Title: MySubject类<br>
 * Description:
 * Company: 安阳师范学院
 *
 * @author 曹涛
 * @version 1.0
 */
public class MySubject extends AbstractSubject {
    @Override
    public void operation() {
        System.out.println("update self...");
        notifyObservers();
    }
}
