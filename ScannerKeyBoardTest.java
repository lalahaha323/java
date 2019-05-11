/*************************************************************************
	> File Name: ScannerKeyBoardTest.java
	> Author: 
	> Mail: 
	> Created Time: 2019年05月10日 星期五 17时00分30秒
 ************************************************************************/
import java.util.Scanner;
public class ScannerKeyBoardTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // sc.useDelimiter("\n");
        while(sc.hasNextLine()) {
            System.out.println("键盘输入的内容是：" + sc.nextLine());
        }
    }
}
