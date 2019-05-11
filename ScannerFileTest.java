/*************************************************************************
	> File Name: ScannerFileTest.java
	> Author: 
	> Mail: 
	> Created Time: 2019年05月10日 星期五 17时12分49秒
 ************************************************************************/
import java.util.Scanner;
import java.io.*;
public class ScannerFileTest {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("ScannerFileTest.java"));
        System.out.println("ScannerFileTest.java文件内容如下：");
        while(sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }
    }
}
