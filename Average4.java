/*************************************************************************
	> File Name: Average4.java
	> Author: 
	> Mail: 
	> Created Time: 2018年11月26日 星期一 22时47分58秒
 ************************************************************************/
import java.util.*;
public class Average4 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double sum = 0;
        int count = 0;
        while(true) {
            try {
                int number = console.nextInt();
                if(number == 0) {
                    break;
                }
                sum += number;
                count++;
            } catch(InputMismatchException ex) {
                System.out.printf("略过非整形输入：%s%n", console.next());
            }
        }
        System.out.printf("平均：%.2f%n", sum / count);
    }
}
