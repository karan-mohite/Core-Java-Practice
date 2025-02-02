public class MethodOverridingDemo2 {
    void show() {
        System.out.println("1");
    }
}

class VPM extends MethodOverridingDemo2 {

    public void show() {
        System.out.println("2");
    }

    public static void main(String[] args) {
        MethodOverridingDemo2 m = new MethodOverridingDemo2();
        m.show();

        VPM v = new VPM();
        v.show();
    }
}
