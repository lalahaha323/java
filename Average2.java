/*************************************************************************
	> File Name: Average2.java
	> Author: 
	> Mail: 
	> Created Time: 2018年11月26日 星期一 22时40分35秒
 ************************************************************************/
import java.util.Scanner;
public class Average2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double sum = 0;
        int count = 0;
        while(true) {
            int number = console.nextInt();
            if(number ==0 ) {
                break;
            }
            sum += number;
            count++;
        }
        System.out.printf("平均 %.2f%n", sum / count);
    }
}

