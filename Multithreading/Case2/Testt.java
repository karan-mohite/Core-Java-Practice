package Case2;

class MyThread1 extends Thread {
    public void run() {
        System.out.println("Task 1");
    }
}

public class Testt {
    public static void main(String[] args) {

        MyThread1 m1 = new MyThread1();
        m1.start();

        MyThread1 m2 = new MyThread1();
        m2.start();

        MyThread1 m3 = new MyThread1();
        m3.start();

        MyThread1 m4 = new MyThread1();
        m4.start();
    }
}
