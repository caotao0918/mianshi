package stack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Title: QueueStack类<br>
 * Description:
 * Company: 安阳师范学院
 *
 * @author 曹涛
 * @version 1.0
 */
//用兩個队列来模拟堆栈结构
public class QueueStack {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        Queue<String> queue2 = new LinkedList<>();
        //往queue队列添加元素
        queue.offer("a");
        queue.offer("b");
        queue.offer("c");
        queue.offer("d");
        queue.offer("e");
        queue.offer("f");
        ArrayList<String> lists = new ArrayList<>(queue);
        System.out.print("进栈：");
        lists.forEach(System.out::print);//循环遍历输出集合的元素

        //以倒叙的方式取出lists集合中的值，并放到queue2中
        for ( int i = lists.size() - 1; i >= 0; i--) {
            queue2.offer(lists.get(i));
        }
        System.out.println();
        System.out.print("出栈：");
        for (String q : queue2) {
            System.out.print(q);
        }

    }
}
