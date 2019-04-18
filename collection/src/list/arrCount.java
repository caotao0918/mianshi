package list;

/**
 * Title: arrCount类<br>
 * Description:
 * Company: 安阳师范学院
 *
 * @author 曹涛
 * @version 1.0
 */
public class arrCount {

    public static void main(String[] args) {

        int[] arr = {1,4,1,4,2,5,4,5,8,7,8,77,88,5,4,9,6,2,4,1,5};
        int a = 0,b = 0,c = 0,d = 0;
        for (int i : arr) {
            if (i == 1) a++;
            if (i == 8) b++;
            if (i == 4) c++;
            if (i == 2) d++;
        }
        System.out.println("1出现" + a + "次");//3
        System.out.println("8出现" + b + "次");//2
        System.out.println("4出现" + c + "次");//5
        System.out.println("2出现" + d + "次");//2
    }
}
