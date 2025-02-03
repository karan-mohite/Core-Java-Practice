import java.io.FileInputStream;

public class ExceptionHandlingDemo {

    public static void main(String args[]) {

        try {
            // FileInputStream fis=new FileInputStream("d:/abc.txt");
            // Class.forName("com.mysql.jdbc.Driver");

            int a = 100, b = 0, c;
            c = a / b;
            System.out.println(c);

            // String name = null;
            // System.out.println(name.length());

        } catch (ArithmeticException e) {
            System.out.println("You cannot divide by zero");
        }
        System.out.println("Hello");
    }
}