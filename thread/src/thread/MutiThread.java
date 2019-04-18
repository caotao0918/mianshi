package thread;

/**
 * Title: MutiThread类<br>
 * Description:
 * Company: 安阳师范学院
 *
 * @author 曹涛
 * @version 1.0
 */
//测试synchronized方法
class Test {
    synchronized void synchronizedMethod() throws InterruptedException {
        System.out.println("calling ...");
        Thread.sleep(3000);
        System.out.println("finshed...");
    }
    synchronized static void staticMethod() {
        System.out.println("lalala...");
    }
}

public class MutiThread {
    private static final Test TEST = new Test();

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            try {
                TEST.synchronizedMethod();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread thread2 = new Thread(() -> TEST.staticMethod());

        thread1.start();
        thread2.start();

    }
}
