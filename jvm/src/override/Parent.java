package override;

/**
 * Title: Parent类<br>
 * Description:
 * Company: 卓瀛工作室
 *
 * @author 曹涛
 * @version 1.0
 */
public class Parent {
    public String sayHello() {
        System.out.println("hello...");
        return "hello";
    }
    public String sayHi(String i) {
        return "hi" + i;
    }
}
