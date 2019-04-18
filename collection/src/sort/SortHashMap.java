package sort;

import java.util.*;

/**
 * Title: SortHashMap类<br>
 * Description:
 * Company: 安阳师范学院
 *
 * @author 曹涛
 * @version 1.0
 */
public class SortHashMap {

    public static void main(String[] args) {
        HashMap<Integer,User> users = new HashMap<>();
        /*ConcurrentHashMap<Integer,User> user = new ConcurrentHashMap<>();
        user.put(1,new User("曹涛曹涛",28));
        Set<Map.Entry<Integer, User>> entrySet = user.entrySet();
        System.out.println(entrySet);
        System.out.println(user);*/
        users.put(1,new User("曹涛",22));
        users.put(2,new User("xiaoxiao",14));
        users.put(3,new User("lihao",20));
        System.out.println(users);
        HashMap<Integer, User> integerUserHashMap = sortHashMap(users);
        System.out.println(integerUserHashMap);
    }
    
    
    private static HashMap<Integer,User> sortHashMap(HashMap<Integer,User> map) {
        //首先拿到map的键值对集合
        Set<Map.Entry<Integer,User>> entrySet = map.entrySet();

        // 将 set 集合转为 List 集合，为什么，为了使用工具类的排序方法
        List<Map.Entry<Integer, User>> list = new ArrayList<>(entrySet);

        // 使用 Collections 集合工具类对 list 进行排序，排序规则使用匿名内部类来实现

        list.sort((o1, o2) -> o2.getValue().getAge() - o1.getValue().getAge());
        //创建一个新的有序的 HashMap 子类的集合
        LinkedHashMap<Integer,User> linkedHashMap = new LinkedHashMap<>();

        for(Map.Entry<Integer, User> entry : list){
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        return linkedHashMap;
    }

}
