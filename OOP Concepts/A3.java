public class A3 {
    void showA() {
        System.out.println("A Class Method..");
    }
}

class B extends A3 {
    void showB() {
        System.out.println("B Class Method..");
    }
}

class C extends A3 {
    void showC() {
        System.out.println("c class Method..");
    }

    public static void main(String[] args) {
        A3 obj = new A3();
        obj.showA();

        System.out.println("------------------------------------------");
        B ob2 = new B();
        ob2.showB();
        ob2.showA();

        System.out.println("------------------------------------------");
        C ob3 = new C();
        ob3.showC();
        ob3.showA();
    }
}
