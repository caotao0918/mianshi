package equalsAndHashCode;

import memory.Person;

/**
 * Title: memory_leak类<br>
 * Description:
 * Company: 安阳师范学院
 *
 * @author 曹涛
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) {

        Person person1 = new Person("唐僧","pwd1",25);
        Person person2 = new Person("孙悟空","pwd2",26);
        Person person3 = new Person("猪八戒","pwd3",27);
        Person person4 = new Person("猪八戒","pwd3",27);
        System.out.println(person3.equals(person4));//true


        System.out.println(person3.hashCode());//-2085357291
        System.out.println(person4.hashCode());//-2085357291

    }
}
