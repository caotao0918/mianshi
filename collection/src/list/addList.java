package list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Title: addList类<br>
 * Description:
 * Company: 安阳师范学院
 *
 * @author 曹涛
 * @version 1.0
 */
public class addList {
    static final int N=50000;
    static long timeList(List list){
        long start = System.currentTimeMillis();
        Object object = new Object();
        for (int i = 0; i < N; i++)
            list.add(0,object);
        return System.currentTimeMillis() - start;
    }

    public static void main(String[] args) {
        System.out.println("arraylist耗時:" + timeList(new ArrayList()));
        System.out.println("linkedlist耗時:" + timeList(new LinkedList()));
    }

}
