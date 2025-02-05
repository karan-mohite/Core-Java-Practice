package interruptedandisInterruptedMethod;

public class Test extends Thread {
    public void run() {
        // System.out.println("A1 :"+Thread.interrupted()); //true-false
        // System.out.println("A2 :"+Thread.interrupted());
        // System.out.println("B1 :" + Thread.currentThread().isInterrupted()); //true->true
        // System.out.println("B2 :" + Thread.currentThread().isInterrupted()); //true->true

        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(i);
                Thread.sleep(1000);
                // System.out.println("B :" + Thread.interrupted());
            }
        } catch (Exception e) {
            System.out.println("Thread Interrupted:" + e);
        }
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.start();
        t.interrupt();
    }
}
