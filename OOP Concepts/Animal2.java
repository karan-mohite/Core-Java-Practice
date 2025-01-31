class Animal2 {
    void eat() {
        System.out.println("I am Eating..!!");
    }
}

class Dog extends Animal2 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
    }
}
