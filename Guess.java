/*************************************************************************
	> File Name: Guess.java
	> Author: 
	> Mail: 
	> Created Time: 2018年11月21日 星期三 22时51分17秒
 ************************************************************************/
import java.util.Scanner;
public class Guess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = (int) (Math.random() * 10);
        int guess;

        do {
            System.out.print("猜数字(0 ~ 9):");
            guess = scanner.nextInt();
        }while(guess != number);

        System.out.println("猜中了");
    }
}

