import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo1 {
    public static void main(String[] args) {

        ArrayList a1 = new ArrayList<>();

        a1.add(0, 10);
        a1.add(1, 100);
        a1.add(2, 'c');
        a1.add(3, "Karan");
        a1.add(4, 50);

        // ArrayList al2 = new ArrayList<>();
        // al2.add(10);
        // al2.add("Vishal");
        // al2.add(50);
        // al2.removeAll(a1);

        // System.out.println(a1);
        // a1.clear();

        // System.out.println(a1.indexOf(50));
        // System.out.println(a1.set(0, "Vishal"));
        // System.out.println(a1.get(3));
        // System.out.println(a1.size());
        // System.out.println(a1.contains(50));

        Iterator itr = a1.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
