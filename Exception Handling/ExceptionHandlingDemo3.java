public class ExceptionHandlingDemo3 {
    public static void main(String[] args) {
        try{
            int a=100,b=0,c;
            c=a/b;
            System.out.println(c);
            System.out.println("Karan");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        System.out.println("Hellllo");
       
    }
}
