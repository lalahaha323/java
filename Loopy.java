/*************************************************************************
	> File Name: Loopy.java
	> Author: 
	> Mail: 
	> Created Time: 2018年11月20日 星期二 21时27分38秒
 ************************************************************************/

public class Loopy {
    public static void main(String[] args) {
        int x = 1;
        System.out.println("Before the Loop");
        while (x < 4) {
            System.out.println("In the loop");
            System.out.println("Value of x is" + x);
            x = x + 1;
        }
        System.out.println("This is after the loop");
    }
}
