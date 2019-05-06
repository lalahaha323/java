/*************************************************************************
	> File Name: CollectionStream.java
	> Author: 
	> Mail: 
	> Created Time: 2019年05月06日 星期一 14时52分55秒
 ************************************************************************/
import java.util.*;
public class CollectionStream {
    public static void main(String[] args) {
        Collection books = new HashSet();
        books.add(new String("轻量级Java EE企业应用实战"));
        books.add(new String("疯狂Java讲义"));
        books.add(new String("疯狂IOS讲义"));
        System.out.println(books.stream().filter(ele -> ((String)ele).contains("疯狂")).count());
    }
}
