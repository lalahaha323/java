/*************************************************************************
	> File Name: Sum.java
	> Author: 
	> Mail: 
	> Created Time: 2018年11月22日 星期四 13时28分46秒
 ************************************************************************/
import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long sum = 0;
        long number = 0;
        do {
            System.out.print("请输入数字: ");
            number  = Long.parseLong(scanner.nextLine());
            sum += number;
        } while(number != 0);
        System.out.println("总和：" + sum);
    }
}

