interface I2 {
    void display1();
}

abstract class MethodOverridingDemo4 {
    abstract void display();

    void show() throws RuntimeException {
        System.out.println("1");
    }
}

class DPM implements I2 {
    void show() {
        System.out.println("2");
    }

    public void display1() {
        System.out.println("vishal");
    }

    void display() {
        System.out.println("Karan");
    }

    public static void main(String[] args) {

        // MethodOverridingDemo4 m=new MethodOverridingDemo4();
        // m.show();

        DPM d = new DPM();
        d.show();

    }
}