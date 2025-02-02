/*
  1) synchronized-keyword parent class madhe kiva child class madhe lavala tri chaalato parent class 
   method is executed and also child class method is also executed.
  2)strictfp-same as a synchronized keyword working 
 */
public class MethodOverridingDemo5 {
    strictfp void show() {
        System.out.println("1");
    }
}

class CDP extends MethodOverridingDemo5 {
    void show() {
        System.out.println("2");
    }

    public static void main(String[] args) {
        MethodOverridingDemo5 m = new MethodOverridingDemo5();
        m.show();

        CDP c = new CDP();
        c.show();
    }
}
