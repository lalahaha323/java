/*************************************************************************
	> File Name: TreeMapTest.java
	> Author: 
	> Mail: 
	> Created Time: 2019年05月07日 星期二 17时54分53秒
 ************************************************************************/
import java.util.*;
class R implements Comparable {
    int count;
    public R(int count) {
        this.count = count;
    }
    public String toString() {
        return "R[count:]" + count + "]";
    }
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        if(obj != null && obj.getClass() == R.class) {
            R r = (R)obj;
            return r.count == this.count;
        }
        return false;
    }
    public int compareTo(Object obj) {
        R r = (R)obj;
        return count > r.count ? 1 : count < r.count ? -1 : 0;
    }
}

public class TreeMapTest {
    public static void main(String[] args) {
        TreeMap tm = new TreeMap();
        tm.put(new R(3), "lala");
        tm.put(new R(-5), "mimi");
        tm.put(new R(9), "haha");
        System.out.println(tm);
        System.out.println(tm.firstEntry());
        System.out.println(tm.lastKey());
        System.out.println(tm.higherKey(new R(2)));
        System.out.println(tm.lowerEntry(new R(2)));
        System.out.println(tm.subMap(new R(-1), new R(4)));
    }
}

