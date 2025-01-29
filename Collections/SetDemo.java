import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set s = new HashSet<>();
        s.add(100);
        s.add(200);
        s.add(300);
        s.add(400);
        s.add(200);
        s.add(300);
        s.add(null);
        s.add(null);
        System.out.println(s);
    }
}
