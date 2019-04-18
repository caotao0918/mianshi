package adapter.Object;

import adapter.Class.Interface.Sourceable;
import adapter.Class.Interface.Targetable;
import adapter.Class.Interface.impl.Source;

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
        Targetable wrapper = new Wrapper(sourceable);
        wrapper.method_01();
        wrapper.method_02();
    }
}
