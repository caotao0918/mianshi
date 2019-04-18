package decorator;

import decorator.Interface.Sourceable;
import decorator.Interface.impl.Source;

/**
 * Title: Test类<br>
 * Description:
 * Company: 安阳师范学院
 *
 * @author 曹涛
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Sourceable sourceable = new Source();
        Sourceable decorator = new Decorator(sourceable);
        sourceable.method();
        decorator.method();
    }
}
