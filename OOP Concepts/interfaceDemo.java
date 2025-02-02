/*  
  1)Interface helps to achieve multiple inheritance 
  2)if we define a method in interface this methos is public abstract if you not define method is public 
  abstact compiler provide automatically public abstract before the void .once define method in interface this method is implemented in child class mandatory 
  3)object is created only child method does not create a interface.
*/
interface I1 {

    void show();
}

interface I2 {
    void display();
}

class interfaceDemo implements I1, I2 {

    public void show() {
        System.out.println("Karan");
    }

    public void display() {
        System.out.println("vishal");
    }

    public static void main(String[] args) {

        // I1 i=new I1();
        interfaceDemo t = new interfaceDemo();
        t.show();
        t.display();

    }

}
