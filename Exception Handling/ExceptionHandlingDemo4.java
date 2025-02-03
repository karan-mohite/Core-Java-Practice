public class ExceptionHandlingDemo4 {
    public static void main(String[] args) {
        ExceptionHandlingDemo4 e=new ExceptionHandlingDemo4();
        e.divide();
        System.out.println("Hello");
    }
    void divide()
    {   
        try{
            int a=100,b=0,c;
            c=a/b;
            System.out.println(c); 
        }
        catch(ArithmeticException e)
        {
            e.printStackTrace();
        }   
    }
}
