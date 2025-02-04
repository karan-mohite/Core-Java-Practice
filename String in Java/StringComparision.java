public class StringComparision {
    public static void main(String[] args) {
        String s1="karan";
        String s2="KARAN";
        // System.out.println(s1.equalsIgnoreCase(s2));
        // System.out.println(s1.equals(""));
        if(s1.equals(" "))
        {
            System.out.println("name cannot be empty");
        }
        else 
        {
            System.out.println("valid name");
        }
    }
}
