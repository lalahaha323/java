import java.util.*;
public class Test {
    public static void main(String[] args) {
        List l1 = new LinkedList();
        List l2 = new LinkedList();
        for(int i = 0; i <= 9; i++) {
            l1.add("a" + i);
        }
        System.out.println(l1);
        Collections.shuffle(l1);
        System.out.println(l1);
        Collections.reverse(l1);
        System.out.println(l1);
        Collections.sort(l1);
        System.out.println(l1);
        System.out.println(Collections.binarySearch(l1,"a5"));
    }
}