import java.util.*;

public class MapDemo {
    public static void main(String[] args) {

        // ArrayList al=new ArrayList<>();
        // al.add(101);
        // al.add(102);
        // al.add(103);

        // System.out.println(al);

        Map map = new HashMap<>();

        map.put(101, "Karan");
        map.put(102, "Vishal");
        map.put(103, "Arun");
        map.put(102, "data");
        map.put(null, null);
        map.put(null, "aaa");
        map.put(108, "Bbbb");
        map.put(105, "ccc");
        map.put(null, null);

        // map.clear();
        // System.out.println(map.containsKey(103));
        // System.out.println(map.containsValue("Karan"));
        // System.out.println(map.get(102));
        // System.out.println( map.isEmpty());
        // map.remove(102);
        // map.replace(102, "Kajal");
        // System.out.println(map.size());

        System.out.println(map);
    }
}
