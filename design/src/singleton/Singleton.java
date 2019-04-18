package singleton;

/**
 * Title: Singleton类<br>
 * Description:
 * Company: 安阳师范学院
 *
 * @author 曹涛
 * @version 1.0
 */
public class Singleton {
    public static Singleton singleton = new Singleton();

    private Singleton() {
    }
    public static Singleton getInstance() {
        return singleton;
    }
}
