public class staticDemo2 {
    static void display() {
        System.out.println("1");
    }

    public static void main(String[] args) {
        // staticDemo2.display();
        display();
        Xyz.show();
    }
}

class Xyz {
    static void show() {
        System.out.println("2");
    }
}
