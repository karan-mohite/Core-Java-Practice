abstract class AbstractVehicalDemo {
    abstract void start();
}

class Car extends AbstractVehicalDemo {
    void start() {
        System.out.println("car starts with key");
    }
}

class scotter extends AbstractVehicalDemo {
    void start() {
        System.out.println("Scotter starts with kick");
    }

    public static void main(String[] args) {
        // AbstractVehicalDemo al=new AbstractVehicalDemo();
        // there is a no create the object of abstract class

        Car c = new Car();
        c.start();

        scotter s = new scotter();
        s.start();
    }
}
