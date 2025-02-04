// s1==s2 this method is checked adress and location 
// s1.equals(s2) this method is checked contant of s1 and s2
// char[] method is useful for to store the password compare to string beacuse of String print Actual value and char[] cannot print actual value

public class StringDemo {
    public static void main(String[] args) {
        // String s1="Karan";  //1objtect in string constant pool
        // String s2=new String("ABC");  //2 object 1 object heap area and another is string constant pool

        // StringBuffer sb=new StringBuffer("Abhinav");
        // byte[] b={101,102,103};
        // char[] c={'a','b','c','d'};
        // String s2=new String(c);
        // System.out.println(s2);


        char[] s1=new char[]{'a','b','c'};  //This method is best for to store a password because user dont know how to store a password in background

        String s2=new String("Karan");

        System.out.println("s1 - :"+s1);
        System.out.println("s2 - :"+s2);

 
    }
}
