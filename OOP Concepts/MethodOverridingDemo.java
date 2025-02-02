class MethodOverridingDemo {
    void show(String a, int b) {
        System.out.println("1");
    }
}

class MNC extends MethodOverridingDemo {
    void show(String a, int b) {
        System.out.println("2");
    }

    public static void main(String[] args) {
        MethodOverridingDemo m = new MethodOverridingDemo();
        m.show("karan", 10);

        MNC l = new MNC();
        l.show("Vishal", 10);
    }
}
