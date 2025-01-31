public class Animal2ByUsingMethod {
    String color;
    int age;

    void initObj(String c, int a) {
        color = c;
        age = a;
    }

    void display() {
        System.out.println(color + " " + age);
    }

    public static void main(String[] args) {
        Animal2ByUsingMethod al2 = new Animal2ByUsingMethod();
        al2.initObj("red", 10);
        al2.display();
    }
}
