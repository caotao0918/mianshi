package thread;

/**
 * Title: TestJoin类<br>
 * Description:
 * Company: 安阳师范学院
 *
 * @author 曹涛
 * @version 1.0
 */
public class TestJoin {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new ThreadImp());
        thread.start();
        thread.join(4999);
        if (thread.isAlive())
            System.out.println("is alive...");
        else
            System.out.println("not alive...");
        System.out.println("join finished...");
    }
}
class ThreadImp implements Runnable{
    @Override
    public void run() {
        try {
            System.out.println("begin...");
            Thread.sleep(5000);
            System.out.println("end...");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
