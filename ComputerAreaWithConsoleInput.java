/*************************************************************************
	> File Name: ComputerAreaWithConsoleInput.java
	> Author: 
	> Mail: 
	> Created Time: 2018年12月05日 星期三 22时50分49秒
 ************************************************************************/
import java.util.Scanner;
public class ComputerAreaWithConsoleInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number for radius: ");
        double radius = input.nextDouble();
        double area = radius * radius * 3.14;
        System.out.println("The area for the circle of radius " + radius + " is" + area);
    }
}

