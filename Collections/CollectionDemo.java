import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
    public static void main(String[] args) {
        ArrayList a1 = new ArrayList<>();
        a1.add("aaa");
        a1.add("bbb");
        a1.add("ccc");
        // System.out.println(a1);
        // System.out.println(a1.size());
        // System.out.println(a1.remove("bbb"));
        // System.out.println(a1);
        a1.clear();
        System.out.println(a1);

        // ArrayList al2=new ArrayList<>();
        // al2.add("bbb");
        // al2.add("ddd");
        // al2.add("ccc");

        // a1.removeAll(al2);
        // System.out.println(a1);
        // System.out.println(al2);

        // ArrayList a2 = new ArrayList<>();
        // a2.add("aaaa");
        // a2.add("bbbb");
        // a2.add("cccc");
        // System.out.println(a2);

        // a1.addAll(a2);
        // System.out.println(a1.add(a2));
        // System.out.println(a1.add("aaaa"));
        // System.out.println(a2);
        // System.out.println(a1.contains(100));
        // System.out.println(a1.isEmpty());

    }
}
