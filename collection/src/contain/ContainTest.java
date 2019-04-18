package contain;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Title: ContainTest类<br>
 * Description:
 * Company: 安阳师范学院
 *
 * @author 曹涛
 * @version 1.0
 */
public class ContainTest {
    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<>();
        Integer aaa = new Integer(10);
        collection.add(aaa);
        Integer bbb = new Integer(10);
        Integer ccc = 100, ddd = 100;
        Integer eee = 200, fff = 200;
        System.out.println(collection.contains(bbb));//true
        System.out.println(aaa == bbb);//false
        System.out.println(ccc == ddd);//true
        System.out.println(eee == fff);//false
        System.out.println(aaa.equals(bbb));//true,Integer中equals方法比较的是值，但是Object比较的是地址
    }

}
