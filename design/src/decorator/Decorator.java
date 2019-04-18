package decorator;

import decorator.Interface.Sourceable;

/**
 * Title: Decorator类<br>
 * Description:
 * Company: 安阳师范学院
 *
 * @author 曹涛
 * @version 1.0
 */
public class Decorator implements Sourceable {
    private Sourceable source;

    public Decorator(Sourceable source) {
        super();
        this.source = source;
    }

    @Override
    public void method() {
        System.out.println("this is before method...");
        source.method();
        System.out.println("this is after method...");
    }
}
