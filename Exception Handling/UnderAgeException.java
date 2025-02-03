public class UnderAgeException extends Exception {

    UnderAgeException() {
        System.out.println("You are under age");
    }

    UnderAgeException(String message) {
        super(message);
    }
}

class voting1 {
    public static void main(String[] args) 
    {
        int age=17;
        try
        {
            if(age<18)
            {
                throw new UnderAgeException("You cannot vote as your age is below 18");
            }
            else
            {
                System.out.println("You can vote now");
            }
        }
        catch(UnderAgeException e)
        {
            e.printStackTrace();
        }
    }
}
