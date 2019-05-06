/*************************************************************************
	> File Name: EnumSetTest2.java
	> Author: 
	> Mail: 
	> Created Time: 2019年05月06日 星期一 22时05分16秒
 ************************************************************************/
import java.util.*;
public class EnumSetTest2 {
    public static void main(String[] args) {
        Collection c = new HashSet();
        c.clear();
        c.add(Season.FALL);
        c.add(Season.SPRING);
        EnumSet enumSet = EnumSet.copyOf(c);
        System.out.println(enumSet);
    }
}
