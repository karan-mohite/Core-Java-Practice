// Performing single task from single Thread
public class Test1 extends Thread{
    public void run()
    {
        System.out.println("Task 1");
    }
    public static void main(String[] args) {
        Test1 t1=new Test1();
        t1.start();
    }
}
