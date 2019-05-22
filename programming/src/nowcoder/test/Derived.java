package nowcoder.test;

/**
 * Title: Alpha类<br>
 * Description:
 * Company: 卓瀛工作室
 *
 * @author 曹涛
 * @version 1.0
 */
class Base1{
    public Base1(String s){
        System.out.print("B");
    }
}
public class Derived extends Base1{
    public Derived (String s) {
        super(s);
        System.out.print("D");
    }
    public static void main(String[] args){
        new Derived("C");
    }
}
