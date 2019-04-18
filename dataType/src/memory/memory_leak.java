/*
package memory;

import java.util.HashSet;
import java.util.Set;

*/
/**
 * Title: memory_leak类<br>
 * Description:
 * Company: 安阳师范学院
 *
 * @author 曹涛
 * @version 1.0
 *//*

public class memory_leak {
    public static void main(String[] args)
    {
        Set<Person> set = new HashSet<Person>();
        Person p1 = new Person("唐僧","pwd1",25);
        Person p2 = new Person("孙悟空","pwd2",26);
        Person p3 = new Person("猪八戒","pwd3",27);
        Person p4 = new Person("猪八戒","pwd3",27);
        System.out.println(p3.equals(p4));
        set.add(p1);
        set.add(p2);
        set.add(p3);
        set.add(p4);
        System.out.println("总共有:"+set.size()+" 个元素!"); //结果：总共有:3 个元素!
        System.out.println(p3.hashCode());
        System.out.println(p4.hashCode());
        p3.setAge(2); //修改p3的年龄,此时p3元素对应的hashcode值发生改变
        System.out.println(p3.hashCode());

        set.remove(p3); //此时remove不掉，造成内存泄漏

        set.add(p3); //重新添加，居然添加成功
        System.out.println("总共有:"+set.size()+" 个元素!"); //结果：总共有:4 个元素!
        for (Person person : set)
        {
            System.out.println(person);
        }
    }
}
*/
