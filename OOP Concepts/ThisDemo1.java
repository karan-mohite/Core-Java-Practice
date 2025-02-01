public class ThisDemo1 {

    void display() {
        System.out.println("Karan Mohite");
    }

    void show() {
       this.display();
    }

    public static void main(String[] args) {
        ThisDemo1 t = new ThisDemo1();
        t.show();
    }
}
