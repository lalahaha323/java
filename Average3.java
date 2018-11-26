/*************************************************************************
	> File Name: Average3.java
	> Author: 
	> Mail: 
	> Created Time: 2018年11月26日 星期一 22时44分06秒
 ************************************************************************/
import java.util.*;
public class Average3 {
    public static void main(String[] args) {
        try {
            Scanner console = new Scanner(System.in);
            double sum = 0;
            int count = 0;
            while(true) {
                int number = console.nextInt();
                if(number == 0) {
                    break;
                }
                sum += number;
                count++;
            }
            System.out.printf("平均 %.2f%n", sum / count);
        }catch(InputMismatchException ex) {
            System.out.println("必须输入整数");
        }
    }
}
