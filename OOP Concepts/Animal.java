public class Animal {

    public void run() {
        System.out.println("This is Animal Block");
    }

    public void eat() {
        System.out.println("I am Eating..!!");
    }

    public static void main(String[] args) {
        Animal al = new Animal();
        al.run();
        al.eat();

        Birds b = new Birds();
        b.fly();
    }
}

class Birds {
    void fly() {
        System.out.println("I am Fly..!!");
    }
}
