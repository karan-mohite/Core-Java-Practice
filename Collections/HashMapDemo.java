import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();

        hm.put(101, "Karan");
        hm.put(102, "Vishal");
        hm.put(105, "Raavi");
        hm.put(103, "Abhinav");
        hm.put(104, "Kajal");
        hm.put(103, "aaa");
        hm.put(111, null);
        hm.put(222, null);

        // hm.remove(103);
        // System.out.println(hm.containsKey(104));
        // System.out.println(hm.containsValue("Karan"));
        // System.out.println(hm.get(105));
        // System.out.println(hm.isEmpty());
        // hm.replace(105, "Dataa");
        // System.out.println(hm.size());
        // System.out.println(hm.remove(105));

        System.out.println(hm);

        // Set set = hm.entrySet();

        // // System.out.println(set);

        // Iterator itr = set.iterator();
        // while (itr.hasNext()) {
        // Map.Entry entry=(Map.Entry)(itr.next());
        // System.out.println(entry.getKey()+"->"+entry.getValue());

        // }

        // for (Map.Entry me:hm.entrySet())
        // {
        // System.out.println(me.getKey()+"->"+me.getValue());
        // }

    }
}
