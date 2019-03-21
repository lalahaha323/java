import java.util.*;
public class Test {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add("hello");
        c.add(new Integer(100));
        System.out.println(c.size());
        System.out.println(c);
    }
}