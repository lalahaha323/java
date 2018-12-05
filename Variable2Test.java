/*************************************************************************
	> File Name: Variable2Test.java
	> Author: 
	> Mail: 
	> Created Time: 2018年12月05日 星期三 21时19分45秒
 ************************************************************************/
class Variable2 {
    static int i = 0, j = 0;
    static synchronized void one() {
        i++;
        j++;
    }
    static synchronized void two() {
        System.out.printf("i = %d, j = %d%n", i, j);
    }
}
public class Variable2Test {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            while(true) {
                Variable2.one();
            }
        });
        Thread thread2 = new Thread(() -> {
            while(true) {
                Variable2.two();
            }
        });
        thread1.start();
        thread2.start();
    }
}

