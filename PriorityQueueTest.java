/*************************************************************************
	> File Name: PriorityQueueTest.java
	> Author: 
	> Mail: 
	> Created Time: 2019年05月07日 星期二 15时32分39秒
 ************************************************************************/
import java.util.*;
public class PriorityQueueTest {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();
        pq.offer(6);
        pq.offer(-3);
        pq.offer(20);
        pq.offer(18);
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
    }
}
