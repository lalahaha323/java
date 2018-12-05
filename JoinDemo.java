/*************************************************************************
	> File Name: JoinDemo.java
	> Author: 
	> Mail: 
	> Created Time: 2018年12月05日 星期三 19时28分39秒
 ************************************************************************/
import static java.lang.System.out;
public class JoinDemo {
    public static void main(String[] args) throws InterruptedException {
        out.println("Main thread 开始...");
        Thread threadB = new Thread(() -> {
            out.println("Thread B 开始...");
            for(int i = 0;i < 5; i++) {
                out.println("Thread B 执行...");
            }
            out.println("Thread B将结束...");
        });
        threadB.start();
        threadB.join();
        out.println("Main thread将结束...");
    }
}

