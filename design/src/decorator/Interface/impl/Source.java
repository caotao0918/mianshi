package decorator.Interface.impl;

import decorator.Interface.Sourceable;

/**
 * Title: Source类<br>
 * Description:
 * Company: 安阳师范学院
 *
 * @author 曹涛
 * @version 1.0
 */
public class Source implements Sourceable {
    @Override
    public void method() {
        System.out.println("this is a method...");
    }
}
