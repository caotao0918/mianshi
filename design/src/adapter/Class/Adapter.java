package adapter.Class;

import adapter.Class.Interface.Targetable;
import adapter.Class.Interface.impl.Source;

/**
 * Title: Adapter类<br>
 * Description:
 * Company: 安阳师范学院
 *
 * @author 曹涛
 * @version 1.0
 */
public class Adapter extends Source implements Targetable {
    @Override
    public void method_02() {
        System.out.println("this is target");
    }
}
