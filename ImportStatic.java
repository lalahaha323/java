/*************************************************************************
	> File Name: ImportStatic.java
	> Author: 
	> Mail: 
	> Created Time: 2018年11月22日 星期四 15时09分38秒
 ************************************************************************/
import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;

public class ImportStatic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        out.print("请输入姓名: ");
        out.printf("%s 你好!%n", scanner.nextLine());
    }
}
