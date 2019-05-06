/*************************************************************************
	> File Name: LinkedHashSetTest.java
	> Author: 
	> Mail: 
	> Created Time: 2019年05月06日 星期一 15时35分10秒
 ************************************************************************/
import java.util.*;
public class LinkedHashSetTest {
    public static void main(String[] args) {
        LinkedHashSet books = new LinkedHashSet();
        books.add("疯狂Java讲义");
        books.add("请联机");
        System.out.println(books);
        books.remove("疯狂Java讲义");
        books.add("疯狂Java讲义");
        System.out.println(books);
    }
}
