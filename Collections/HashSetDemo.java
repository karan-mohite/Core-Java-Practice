import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet hs = new HashSet<>();
        // hs.add(10);
        // hs.add("Karan");
        // hs.add("Vishal");
        // hs.add(10.2);
        // hs.add(true);
        // hs.add(10);
        // hs.add(null);
        // hs.add(null);

        hs.add(30);
        hs.add(10);
        hs.add(20);
        hs.add(40);        

        System.out.println(hs);

       Iterator itr= hs.iterator();
       while (itr.hasNext())
       {
            System.out.println(itr.next()); 
       }
    }
}
