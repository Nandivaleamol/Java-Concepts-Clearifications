package practice.threading;

class MyRunnable implements Runnable{

    @Override
    public void run() {
        for (int i=0; i<10; i++){
            System.out.println("Child thread "+i);
        }
    }
}

public class RunnableDemo {
    public static void main(String[] args) {

        Thread t = new Thread(new MyRunnable());

        t.start();

        for (int i=0; i<10; i++){
            System.out.println("Main thread "+i);
        }
    }
}