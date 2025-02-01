public class ThisDemo2 {

    ThisDemo2() {
        this(10);
        System.out.println("No argument Constructor");
    }

    ThisDemo2(int a) {
         System.out.println("Parameterized Constructor");
    }
    public static void main(String[] args) {
        ThisDemo2 t = new ThisDemo2();
    }
}
