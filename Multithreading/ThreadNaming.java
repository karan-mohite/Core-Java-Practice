public class ThreadNaming extends Thread {
    public void run() {
        Thread.currentThread().setName("Karan");
        System.out.println("Thread Task is printed by:" + Thread.currentThread().getName());
    }

    public static void main(String[] args) {

        System.out.println("Hello is printed by:" + Thread.currentThread().getName());
        ThreadNaming t1 = new ThreadNaming();
        // t1.setName("karan");
        t1.start();
        System.out.println(Thread.currentThread().isAlive());
        // ThreadNaming t2=new ThreadNaming();
        // // t2.setName("Vishal");
        // t2.start();
        System.out.println(t1.isAlive());

    }
}
