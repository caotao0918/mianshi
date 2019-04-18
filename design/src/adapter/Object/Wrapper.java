package adapter.Object;

import adapter.Class.Interface.Sourceable;
import adapter.Class.Interface.Targetable;

/**
 * Title: Wrapper类<br>
 * Description:
 * Company: 安阳师范学院
 *
 * @author 曹涛
 * @version 1.0
 */
public class Wrapper implements Targetable {

    private Sourceable sourceable;
    Wrapper(Sourceable sourceable) {
        super();
        this.sourceable = sourceable;
    }


    @Override
    public void method_01() {
        sourceable.method_01();
    }

    @Override
    public void method_02() {
        System.out.println("this is wrapper...");
    }
}
