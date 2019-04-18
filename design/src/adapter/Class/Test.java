package adapter.Class;

import adapter.Class.Interface.Sourceable;
import adapter.Class.Interface.Targetable;

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
        Sourceable adapter01 = new Adapter();
        adapter01.method_01();

        Targetable adapter = new Adapter();
        adapter.method_01();
        adapter.method_02();
    }
}
