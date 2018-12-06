/*************************************************************************
	> File Name: AdditionQuiz.java
	> Author: 
	> Mail: 
	> Created Time: 2018年12月06日 星期四 12时56分54秒
 ************************************************************************/
import java.util.Scanner;

public class AdditionQuiz {
    public static void main(String[] args) {
        int number1 = (int)(System.currentTimeMillis() % 10);
        int number2 = (int)(System.currentTimeMillis() / 7 % 10);

        Scanner input = new Scanner(System.in);
        System.out.print("What is " + number1 + " + " + number2 + "?");
        int answer = input.nextInt();
        System.out.println( number1 + " + " + number2 + " = " + answer + " is " + (number1 + number2 == answer) );
    }
}

