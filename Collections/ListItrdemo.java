import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListItrdemo {
    public static void main(String[] args) {
        List l=new ArrayList<>();


        l.add("Karan");
        l.add("Vishal");
        l.add(10);

        ListIterator li=l.listIterator();
        // while (li.hasNext())    
        // {
        //     System.out.println(li.next());
        // }
        li.next();
        li.next();
        li.next();
        System.out.println("----------------------------------");

        while (li.hasPrevious()) 
        {
            System.out.println(li.previous());    
        }

        // li.add(100);
        // System.out.println(l);
        
        li.set(200);
        System.out.println(l);

    }   
}
