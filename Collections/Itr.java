import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Itr {
        public static void main(String[] args) {
            List l=new ArrayList<>();
            l.add("Karan");
            l.add(10);
            l.add("Vishal");
            System.out.println(l);

            Iterator itr=l.iterator();
            
            while (itr.hasNext())
            {
                System.out.println(itr.next());    
            }

            l.remove("Karan");
            System.out.println(l);
        }
}
