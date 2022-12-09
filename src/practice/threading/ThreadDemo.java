package practice.threading;

class MyThread1 extends Thread{

    @Override
    public void run() {  // run() method is responsible to execute child thread
        for (int i=0; i<10; i++){
            System.out.println("Child Thread "+i);
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {

        MyThread1  t1 = new MyThread1();
        t1.start(); // start() method is responsible to creates new  thread and invoke run() method...

        for (int i=0; i<10; i++){
            System.out.println("Main thread "+i);
        }
    }
}
