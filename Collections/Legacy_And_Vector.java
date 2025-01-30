import java.util.Vector;

public class Legacy_And_Vector {
    public static void main(String[] args) {
        Vector v = new Vector<>();

        v.add("Karan");
        v.add(1, "Vishal");
        v.addElement("Abinav");
        v.add(100);
        v.add(200);
        v.add('g');
        v.add(20.30);
        v.add("Karan");
        v.add(null);
        v.add(null);
        // System.out.println(v);
        // System.out.println(v.removeElement("Karan"));
        // v.removeElementAt(1);
        // v.removeAllElements();
        System.out.println(v.capacity());
    }
}
