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
    public static String sayHi(String i) {
        return "hi" + i;
    }

    public static void main(String[] args) {
        Parent parent = new Parent();
        String str = "cat";
        String s = parent.sayHi(str);
        System.out.println(s);
    }
}
