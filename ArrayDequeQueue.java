/*************************************************************************
	> File Name: ArrayDequeQueue.java
	> Author: 
	> Mail: 
	> Created Time: 2019年05月07日 星期二 15时50分08秒
 ************************************************************************/
import java.util.*;
public class ArrayDequeQueue {
    public static void main(String[] args) {
        ArrayDeque queue = new ArrayDeque();
        queue.offer("疯狂Java讲义");
        queue.offer("轻量级Java EE企业应用实战");
        queue.offer("疯狂Android讲义");
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);
    }
}
