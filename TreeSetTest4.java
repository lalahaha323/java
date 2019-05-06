/*************************************************************************
	> File Name: TreeSetTest4.java
	> Author: 
	> Mail: 
	> Created Time: 2019年05月06日 星期一 20时43分39秒
 ************************************************************************/
import java.util.*;
class M {
    int age;
    public M(int age) {
        this.age = age;
    }
    public String toString() {
        return "M [age:" + age + "]";
    }
}
public class TreeSetTest4 {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet((o1, o2) -> {
            M m1 = (M)o1;
            M m2 = (M)o2;
            return m1.age > m2.age ? -1 : m1.age < m2.age ? 1 : 0;
                });
        ts.add(new M(5));
        ts.add(new M(-3));
        ts.add(new M(9));
        System.out.println(ts);
    }
}

