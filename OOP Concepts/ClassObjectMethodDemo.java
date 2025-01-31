public class ClassObjectMethodDemo {
    public void run() {
        System.out.println("This is Animal Block");
    }

    public void eat() {
        System.out.println("I am Eating..!!");
    }

    public static void main(String[] args) {
        ClassObjectMethodDemo al = new ClassObjectMethodDemo();
        al.run();
        al.eat();
    }
}
