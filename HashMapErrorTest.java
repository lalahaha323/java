/*************************************************************************
	> File Name: HashMapErrorTest.java
	> Author: 
	> Mail: 
	> Created Time: 2019年05月07日 星期二 17时16分59秒
 ************************************************************************/
import java.util.*;
public class HashMapErrorTest {
    public static void main(String[] args) {
        HashMap ht = new HashMap();
        ht.put(new A(60000), "疯狂Java讲义");
        ht.put(new A(80), "lala");
        Iterator it = ht.keySet().iterator();
        A first = (A)it.next();
        first.count = 30;
        System.out.println(ht);
        System.out.println(ht.get(new A(30)));
        ht.remove(new A(80));
        System.out.println(ht);
        System.out.println(ht.get(new A(60000)));
        System.out.println(ht.get(new A(30)));
    }
}

