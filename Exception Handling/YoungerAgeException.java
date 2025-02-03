import java.util.Scanner;

public class YoungerAgeException extends RuntimeException {
    YoungerAgeException(String msg) {
        super(msg);
    }

}

class voting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age:");
        int age = sc.nextInt();
        try {

            if (age < 18) {
                throw new YoungerAgeException("You are not eligible for voting");
            } else {
                System.out.println("You can vote successfully..!!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
