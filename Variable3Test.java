/*************************************************************************
	> File Name: Variable3Test.java
	> Author: 
	> Mail: 
	> Created Time: 2018年12月05日 星期三 21时26分33秒
 ************************************************************************/
class Variable3 {
    volatile static int i = 0, j = 0;
    static void one() {
        i++;
        j++;
    }
    static void two() {
        System.out.printf("i = %d, j = %d%n", i, j);
    }
}
public class Variable3Test {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            while(true) {
                Variable3.one();
            }
        });
        Thread thread2 = new Thread(() -> {
            while(true) {
                Variable3.two();
            }
        });
        thread1.start();
        thread2.start();
    }
}

