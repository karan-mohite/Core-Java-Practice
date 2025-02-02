public class polymorphismDemo {
    void show(Object a) {
        System.out.println("object Method");
    }

    void show(String a) {
        System.out.println("String Method");
    }

    public static void main(String[] args) {
        polymorphismDemo p = new polymorphismDemo();
        p.show("ABC"); // Autmatic promotion is occured here

        // System.out.println("1");
        // polymorphismDemo p=new polymorphismDemo();
        // p.main(20);
    }
    // public static void main(int a) {
    // System.out.println("3");
    // }
}
