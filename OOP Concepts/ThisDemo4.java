public class ThisDemo4 {
    void m1(ThisDemo4 t) {
        System.out.println("I am in m1 Method");
    }

    void m2() {
        m1(this);
    }

    public static void main(String[] args) {
        ThisDemo4 t = new ThisDemo4();
        t.m2();
    }
}
