package integer;

/**
 * Title: TestAutoUnBoxing类<br>
 * Description:
 * Company: 安阳师范学院
 *
 * @author 曹涛
 * @version 1.0
 */
public class TestAutoUnBoxing {
    public static void main(String[] args) {
        Integer a = new Integer(3);
        Integer b = 3;
        int c = 3;
        System.out.println(a == b);//false
        System.out.println(a.equals(b));//true
        System.out.println(b == c);//true
        System.out.println(a == c);//true
    }
}
