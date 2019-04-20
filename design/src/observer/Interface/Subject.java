package observer.Interface;

/**
 * Title: Subject接口<br>
 * Description:
 * Company: 安阳师范学院
 *
 * @author 曹涛
 * @version 1.0
 */
public interface Subject {
    //新增观察者
    void add(Observer observer);
    //删除观察者
    void del(Observer observer);
    //通知所有的观察者
    void notifyObservers();
    //自身的操作
    void operation();
}
