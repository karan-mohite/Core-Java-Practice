import java.util.Stack;

public class Stack_Properties_Methods {
    public static void main(String[] args) {
        Stack s=new Stack<>();

        s.push("Karan");
        s.push("Vishal");
        s.push(101);
        s.push(10.99);
        // System.out.println(s);
        // System.out.println(s.pop());
        // System.out.println(s);
        // System.out.println(s.peek());
        // System.out.println(s.search(101));

        System.out.println(s.empty());  
    }
}
