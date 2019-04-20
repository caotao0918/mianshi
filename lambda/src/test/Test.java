package test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

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
        List<String> list = Arrays.asList("caotao","yangwanhao","liyitong","dzq","曹涛");
        for (String s : list) {
            System.out.println(s);
        }
        list.forEach(System.out::println);

    }
    public static void filter(List<String> names, Predicate<String> predicate) {
        for (String name : names) {
            if (predicate.test(name)) {
                System.out.println(name + "");
            }
        }
    }
}
