package practice.threading;


class MyThread3 extends Thread{

}

public class PriorityDemo {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getPriority());

        System.out.println(MyThread3.currentThread().getPriority());

        MyThread3.currentThread().setPriority(10);
        System.out.println(MyThread3.currentThread().getPriority());
    }
}
