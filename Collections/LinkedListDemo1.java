import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDemo1 {
    public static void main(String[] args) {

        ArrayList all = new ArrayList<>();
        all.add(1010);
        all.add(2020);
        all.add("Vishal");
        all.add('c');

        LinkedList l1 = new LinkedList<>(all);

        l1.add("Karan");
        l1.add(105);
        l1.add(105);
        // l1.add(22.34);
        // l1.add('c');
        // l1.add(null);
        // l1.add(null);
        // l1.add(null);

        // l1.addFirst("Vishal");
        // l1.addLast("Arun");

        // l1.removeFirst();
        // l1.removeLast();

        // System.out.println(l1.getFirst());
        // System.out.println(l1.getLast());
        System.out.println(l1);
    }
}