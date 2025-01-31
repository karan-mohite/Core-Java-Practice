// Multilevel Inheritance 
class A1 {
    void showA() {
        System.out.println("A Class Method..");
    }

}

class B extends A1 {
    void showB() {
        System.out.println("B Class Method..");
    }
}

class C extends B {
    void showC() {
        System.out.println("c class Method..");
    }

    public static void main(String[] args) {
        A1 obj = new A1();
        obj.showA();
        System.out.println("-------------------------------------------");
        B ob2 = new B();
        ob2.showB();
        ob2.showA();
        System.out.println("-------------------------------------------");
        C ob3 = new C();
        ob3.showC();
        ob3.showA();
        ob3.showB();
    }
}
