package yieldmethod;

public class Test extends Thread 
{
    public void run()
    {
        Thread.yield();
        for(int i=1;i<=5;i++)
        {
            System.out.println(Thread.currentThread().getName()+" - "+i);
        }
    }    
    public static void main(String[] args) {
        Test t1=new Test();
        t1.start();
        // Thread.yield(); if you want main method to stop and provide chance to other threads for execution
        for(int i=1;i<=5;i++)
        {
            System.out.println(Thread.currentThread().getName()+"-"+i);
        }
    }
}
