/*************************************************************************
	> File Name: RequestQueue2.java
	> Author: 
	> Mail: 
	> Created Time: 2018年11月27日 星期二 18时34分03秒
 ************************************************************************/
import java.util.*;
interface Request2 {
    void execute();
}
public class RequestQueue2 {
    public static void main(String[] args) {
        Queue<Request2> requests = new LinkedList<>();
        offerRequestTo(requests);
        process(requests);
    }
    static void offerRequestTo(Queue<Request2>requests) {
        for(int i = 1; i < 6; i++) {
            requests.offer( 
                    () -> System.out.printf("处理数据 %f%n", Math.random()) 
                    );
        }
    }
    static void process(Queue<Request2> requests) {
        while(requests.peek() != null) {
            Request2 request = requests.poll();
            request.execute();
        }
    }
}

