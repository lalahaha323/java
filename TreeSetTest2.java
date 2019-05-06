/*************************************************************************
	> File Name: TreeSetTest2.java
	> Author: 
	> Mail: 
	> Created Time: 2019年05月06日 星期一 20时09分18秒
 ************************************************************************/
import java.util.*;
class Z implements Comparable {
    int age;
    public Z(int age) {
        this.age = age;
    }
    public boolean equals(Object obj) {
        return true;
    }
    public int compareTo(Object obj) {
        return 1;
    }
}
public class TreeSetTest2 {
    public static void main(String[] args) {
        TreeSet set = new TreeSet();
        Z z1 = new Z(6);
        set.add(z1);
        System.out.println(set.add(z1));
        System.out.println(set);
        ((Z)(set.first())).age = 9;
        System.out.println(((Z)(set.last())).age);
    }
}

