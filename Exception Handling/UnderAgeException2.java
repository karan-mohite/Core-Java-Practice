public class UnderAgeException2 extends RuntimeException {

    UnderAgeException2() {
        System.out.println("You are under age");
    }

    UnderAgeException2(String message) {
        super(message);
    }
}

class voting2 {
    public static void main(String[] args) {
        int age = 17;
        try {

            if (age < 18) {
                throw new UnderAgeException("You cannot vote as your age is below 18");
            } else {
                System.out.println("You can vote now");
            }
        } catch (UnderAgeException e1) {
            e1.printStackTrace();
        }
        System.out.println("Hello");
    }

}
