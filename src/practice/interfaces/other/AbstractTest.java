package practice.interfaces.other;

public abstract class AbstractTest {

    abstract void m1();

    static void m3(){
        System.out.println("static method inside abstract class");
    }

    public static void main(String[] args) {
        System.out.println("main() method inside abstract class.");
        AbstractTest.m3();

    }
}
