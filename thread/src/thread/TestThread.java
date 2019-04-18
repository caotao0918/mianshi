package thread;

/**
 * Title: TestThread类<br>
 * Description:
 * Company: 安阳师范学院
 *
 * @author 曹涛
 * @version 1.0
 */
public class TestThread {
    public static void main(String[] args) {
        new Thread(() -> {
            try {
                Thread.sleep(200000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("-------------");
        }).start();
    }
}
