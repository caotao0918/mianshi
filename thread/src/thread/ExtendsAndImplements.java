package thread;

/**
 * Title: ExtendsAndImplements类<br>
 * Description:
 * Company: 安阳师范学院
 *
 * @author 曹涛
 * @version 1.0
 */
public class ExtendsAndImplements extends Thread implements Runnable {
    @Override
    public void run() {
        System.out.println("running...");
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("stop...");
        Thread.sleep(5000);
        for (int i = 0; i < 10 ; i++) {
            Thread.sleep(1000);
            System.out.println(i);
        }
        Thread thread = new Thread(new ExtendsAndImplements());
        thread.start();
    }
}
