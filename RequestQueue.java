/*************************************************************************
	> File Name: RequestQueue.java
	> Author: 
	> Mail: 
	> Created Time: 2018年11月27日 星期二 17时42分56秒
 ************************************************************************/
import java.util.*;
interface Request {
    void execute();
}
public class RequestQueue {
    public static void main(String[] args) {
        Queue requests = new LinkedList();
        offerRequestTo(requests);
        process(requests);
    }
    static void offerRequestTo(Queue requests) {
        for(int i = 1; i < 6; i++) {
            Request request = new Request() {
                public void execute() {
                    System.out.printf("处理数据 %f%n", Math.random());
                }
            };
            requests.offer(request);
        }
    }
    static void process(Queue requests) {
        while(requests.peek() != null) {
            Request request = (Request) requests.poll();
            request.execute();
        }
    }
}

