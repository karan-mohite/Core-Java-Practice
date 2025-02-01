public class StaticCounterDemo {
    static int count = 0;

    StaticCounterDemo() {
        count++;
        System.out.println(count);
    }

    public static void main(String[] args) {
        StaticCounterDemo c1 = new StaticCounterDemo();
        StaticCounterDemo c2 = new StaticCounterDemo();
        StaticCounterDemo c3 = new StaticCounterDemo();
    }
}
