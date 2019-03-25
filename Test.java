import java.util.*;
public class Test {
    public static void main(String[] args) {
        Map m1 = new HashMap();
        Map m2 = new TreeMap();
        m1.put("one", 1);
        m1.put("two", 2);
        m1.put("three", 3);
        m2.put("A", 1);
        m2.put("B", 2);
        System.out.println(m1.size());
        System.out.println(m1);
        System.out.println(m1.containsKey("one"));
        System.out.println(m2.containsValue(1));
        if(m1.containsKey("two")) {
            int i = (Integer)m1.get("two");
            System.out.println(i);
        }
    }
}