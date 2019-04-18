package main;

public class TestMain extends Base {

    public TestMain(String name, int age) {
        super(name,age);
    }

    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++){
            System.out.println(args[i]);
        }
        Base c = new Base();
        c.println();


    }

}
class Base {
    void println(){
        System.out.println("===========");
    }
    private String name;
    private int age;

    Base() {
        System.out.println("11111111111");
    }

    Base(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("6666666666");
    }
}
