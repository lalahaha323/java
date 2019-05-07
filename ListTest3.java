/*************************************************************************
	> File Name: ListTest3.java
	> Author: 
	> Mail: 
	> Created Time: 2019年05月07日 星期二 15时12分06秒
 ************************************************************************/
import java.util.*;
public class ListTest3 {
    public static void main(String[] args) {
        List books = new ArrayList();
        books.add(new String("轻量级Java EE企业应用实战"));
        books.add(new String("疯狂Java讲义"));
        books.add(new String("疯狂Android讲义"));
        books.add(new String("疯狂ios讲义"));
        books.sort((o1, o2) -> ((String)o1).length() - ((String)o2).length());
        System.out.println(books);
        books.replaceAll(ele -> ((String)ele).length());
        System.out.println(books);

    }
}
