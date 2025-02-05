public class Testt implements Runnable {
    public void run() {
        System.out.println("Thread Task 2");
    }

    public static void main(String[] args) {
        Testt t = new Testt();
        Thread t1 = new Thread(t);
        t1.start();
    }
}
