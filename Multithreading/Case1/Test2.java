//performing  a single task from single thread
class MyThread1  extends Thread{
    public void run()
    {
        System.out.println("Thread 1");
    }
} 
public class Test2
{
    public static void main(String args[])
    {
         MyThread1 m1=new MyThread1();
        m1.start();
    }
}


