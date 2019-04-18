package observer.Interface.impl;

import observer.Interface.Observer;

/**
 * Title: Observer2类<br>
 * Description:
 * Company: 安阳师范学院
 *
 * @author 曹涛
 * @version 1.0
 */
public class Observer2 implements Observer {
    @Override
    public void update() {
        System.out.println("2 >> received...");
    }
}
