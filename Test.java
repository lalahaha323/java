import java.util.*;
public class Test {
    public static void main(String[] args) {
        Set s = new HashSet();
        s.add("hello");
        s.add("world");
        s.add("world");
        System.out.println(s);
    }
}