/*************************************************************************
	> File Name: ComputerAreaWithConstant.java
	> Author: 
	> Mail: 
	> Created Time: 2018年12月05日 星期三 23时07分21秒
 ************************************************************************/
import java.util.Scanner;

public class ComputerAreaWithConstant {
    public static void main(String[] args) {
        final double PI = 3.14159;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number for radius: ");
        double radius = input.nextDouble();
        double area = radius * radius * PI;
        System.out.println("The area for the circle of radius " + radius + " is " + area);
    }
}

