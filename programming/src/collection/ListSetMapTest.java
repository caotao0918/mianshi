package collection;

import java.util.*;

/**
 * Title: ListSetMapTest类<br>
 * Description:
 * Company: 安阳师范学院
 *
 * @author 曹涛
 * @version 1.0
 */
public class ListSetMapTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("D");
        list.add(null);
        list.add(null);
        System.out.println("list:" + list);
        Set<String> set = new HashSet<>();
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        set.add("D");
        set.add(null);
        set.add(null);
        System.out.println("set:" + set);
        Map<String, String> map = new HashMap<>();
        map.put("A", "A");
        map.put("B", "B");
        map.put("C", "C");
        map.put("D", "D");
        map.put(null, null);
        map.put(null, null);
        map.put("E", null);
        System.out.println("map:" + map);
    }
}
