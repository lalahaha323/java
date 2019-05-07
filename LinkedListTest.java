/*************************************************************************
	> File Name: LinkedListTest.java
	> Author: 
	> Mail: 
	> Created Time: 2019年05月07日 星期二 15时56分00秒
 ************************************************************************/
import java.util.*;
public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList books = new LinkedList();
        books.offer("疯狂Java讲义");
        books.push("轻量级");
        books.offerFirst("疯狂");
        for(int i = 0; i < books.size(); i++) {
            System.out.println("遍历中：" + books.get(i));
        }
        System.out.println(books);
        System.out.println(books.peekFirst());
        System.out.println(books.peekLast());
        System.out.println(books.pop());
        System.out.println(books);
        System.out.println(books.pollLast());
        System.out.println(books);
    }
}

