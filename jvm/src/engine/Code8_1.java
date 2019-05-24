package engine;

public class Code8_1 {
    static int b;
    public static void main(String[] args) {
        {
            byte[] placeholder = new byte[64*1024*1024];
        }
        int a;
        System.out.println(b);
        System.gc();
    }

}
