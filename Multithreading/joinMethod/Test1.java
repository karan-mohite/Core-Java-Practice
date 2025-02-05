package joinMethod;

public class Test1 extends Thread {
    static Thread mainThread;

    public void run() {
        try {
            mainThread.join();
            for (int i = 1; i <= 5; i++) {
                System.out.println("Child Thread:" + i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        mainThread = Thread.currentThread();
        Test1 t = new Test1();
        t.start();

        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Main Thread:" + i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
