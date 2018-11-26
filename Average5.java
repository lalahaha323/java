/*************************************************************************
	> File Name: Average5.java
	> Author: 
	> Mail: 
	> Created Time: 2018年11月26日 星期一 22时54分54秒
 ************************************************************************/
import java.util.Scanner;
public class Average5 {
    public static void main(String[] args) {
        double sum = 0;
        int count = 0;
        while(true) {
            int number = nextInt();
            if(number ==0 ){
                break;
            }
            sum += number;
            count++;
        }
        System.out.printf("平均 %.2f%n", sum / count);
    }

    static Scanner console = new Scanner(System.in);

    static int nextInt() {
        String input = console.next();
        while(!input.matches("\\d*")) {
            System.out.println("请输入数字");
            input = console.next();
        }
        return Integer.parseInt(input);
    }
}

