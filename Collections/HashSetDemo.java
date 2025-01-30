import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    public static void main(String[] args) {

        ArrayList al = new ArrayList<>();

        al.add("Karan");
        al.add(1010);
        al.add('c');

        HashSet hs = new HashSet<>();
        // hs.add(10);
        // hs.add("Karan");
        // hs.add("Vishal");
        // hs.add(10.2);
        // hs.add(true);
        // hs.add(10);
        // hs.add(null);
        // hs.add(null);

        hs.addAll(al);
        hs.add(30);
        hs.add(10);
        hs.add(20);
        hs.add(40);

        // hs.clear();

        hs.remove(30);
        System.out.println(hs.size());
        System.out.println(hs);

        // System.out.println(hs.contains("Karan"));

        // System.out.println(hs);

        // Iterator itr= hs.iterator();
        // while (itr.hasNext())
        // {
        // System.out.println(itr.next());
        // }
    }
}
