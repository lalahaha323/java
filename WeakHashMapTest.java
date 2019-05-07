/*************************************************************************
	> File Name: WeakHashMapTest.java
	> Author: 
	> Mail: 
	> Created Time: 2019年05月07日 星期二 18时07分20秒
 ************************************************************************/
import java.util.*;
public class WeakHashMapTest {
    public static void main(String[] args) {
        WeakHashMap whm = new WeakHashMap();
        whm.put(new String("语文"), new String("good"));
        whm.put(new String("数学"), new String("good"));
        whm.put(new String("英语"), new String("nice"));
       // whm.put("java", new String("a"));
        System.out.println(whm);
        System.gc();
        System.runFinalization();
        System.out.println(whm);
    }
}

