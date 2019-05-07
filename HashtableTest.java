/*************************************************************************
	> File Name: HashtableTest.java
	> Author: 
	> Mail: 
	> Created Time: 2019年05月07日 星期二 17时05分39秒
 ************************************************************************/
import java.util.*;
class A {
    int count;
    public A(int count) {
        this.count = count;
    }
    public boolean equals(Object obj) {
        if(obj == this)
            return true;
        if(obj != null && obj.getClass() == A.class) {
            A a = (A)obj;
            return this.count == a.count;
        }
        return false;
    }
    public int hashCode() {
        return this.count;
    }
}
class B {
    public boolean equals(Object obj) {
        return true;
    }
}
public class HashtableTest {
    public static void main(String[] args) {
        Hashtable ht = new Hashtable();
        ht.put(new A(6000), "疯狂Java讲义");
        ht.put(new A(87563), "轻量级Java EE企业应用实战");
        ht.put(new A(1232), new B());
        System.out.println(ht);
        System.out.println(ht.containsValue("lala"));
        System.out.println(ht.containsKey(new A(87563)));
        ht.remove(new A(1232));
        System.out.println(ht);
    }
}

