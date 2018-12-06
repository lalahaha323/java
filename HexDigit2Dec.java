/*************************************************************************
	> File Name: HexDigit2Dec.java
	> Author: 
	> Mail: 
	> Created Time: 2018年12月06日 星期四 14时09分00秒
 ************************************************************************/
import java.util.Scanner;

public class HexDigit2Dec {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a hex digit: ");
        String hexString = input.nextLine();

        if(hexString.length() != 1) {
            System.out.println("You must enter exactly one character");
            System.exit(1);
        }

        char ch = Character.toUpperCase(hexString.charAt(0));
        if(ch <= 'F' && ch >= 'A') {
            int value = ch - 'A' + 10;
            System.out.println("The decimal value for hex dight " + ch + " is " + value);
        } else if (Character.isDigit(ch))  {
            System.out.println("The decimal value for hex dight " + ch + " is " + ch);
        } else {
            System.out.println(ch + " is an invalid input");
        }
    }
}

