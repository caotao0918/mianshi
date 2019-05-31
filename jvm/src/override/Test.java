package override;

/**
 * Title: Test类<br>
 * Description:
 * Company: 卓瀛工作室
 *
 * @author 曹涛
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Parent child = new Child();
        String s = parent.sayHello();
        System.out.println(s);
        String str = child.sayHi("str");
        System.out.println(str);
    }
}
