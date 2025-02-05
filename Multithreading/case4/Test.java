// peforming multiple task from multiple thread
package case4;

class MyThread1 extends Thread {
    public void run() {
        System.out.println("Playing Music");
    }
}

class MyThread2 extends Thread {
    public void run() {
        System.out.println("Playing Vedio");
    }
}

class MyThread3 extends Thread {
    public void run() {
        System.out.println("Progress bar is executing");
    }
}

class MyThread4 extends Thread {
    public void run() {
        System.out.println("timer is exexuting");
    }
}

public class Test {
    public static void main(String[] args) {
        MyThread1 m1 = new MyThread1();
        m1.start();

        MyThread2 m2 = new MyThread2();
        m2.start();

        MyThread3 m3 = new MyThread3();
        m3.start();

        MyThread4 m4 = new MyThread4();
        m4.start();
    }
}
