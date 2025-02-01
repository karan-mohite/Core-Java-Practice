public class staticDemo4 {
    static int i = 10;

    static void display() {
        show();
        System.out.println(i);
    }

    static void show() {
        System.out.println("3");
    }

    public static void main(String[] args) {
        display();
    }
}
