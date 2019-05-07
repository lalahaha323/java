/*************************************************************************
	> File Name: IdentityHashMapTest.java
	> Author: 
	> Mail: 
	> Created Time: 2019年05月07日 星期二 18时13分15秒
 ************************************************************************/
import java.util.*;
public class IdentityHashMapTest {
    public static void main(String[] args) {
        IdentityHashMap ihm = new IdentityHashMap();
        ihm.put(new String("lala"), 20);
        ihm.put(new String("lala"), 30);
        ihm.put("java", 90);
        ihm.put("java", 100);
        System.out.println(ihm);
    }
}
