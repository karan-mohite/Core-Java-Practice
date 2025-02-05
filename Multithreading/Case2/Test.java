// performing single task from multiple thread
package Case2;

public class Test extends Thread{
    public void run()
    {
        System.out.println("Task 1");
    }
    public static void main(String[] args) {
        Test t1=new Test();
        t1.start();

        Test t2=new Test();
        t2.start(); 
    }
}
