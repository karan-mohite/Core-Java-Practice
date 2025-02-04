import java.util.HashMap;
import java.util.*;
public class MaxRepChar2 {
    public static void main(String[] args) {
        String s="this is demo";
        s=s.replaceAll("\\s", "");

        HashMap<Character,Integer> hm=new HashMap<>();

        char[] c=s.toCharArray();
        for(char ch:c)
        {
            if(hm.containsKey(c))
            {
                hm.put(ch, hm.get(ch)+1);
            }
            else
            {
                hm.put(ch, 1);
            }
        }
        int maxCount=0;
        char maxChar=' ';
        for(Map.Entry<Character,Integer> me:hm.entrySet())
        {
                if(maxCount<me.getValue())
                {
                    maxCount =me.getValue();
                    maxChar=me.getKey();
                }
        }
        System.out.println("Maximum Repeated Character is "+maxChar);
    }
}
