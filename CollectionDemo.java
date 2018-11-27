/*************************************************************************
	> File Name: CollectionDemo.java
	> Author: 
	> Mail: 
	> Created Time: 2018年11月27日 星期二 22时36分55秒
 ************************************************************************/
import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add("a");
        c.add("b");
        c.add("c");
        System.out.println(c);
        Object[] arr = c.toArray();
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

