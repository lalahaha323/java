/*************************************************************************
	> File Name: AccessExceptionMsg.java
	> Author: 
	> Mail: 
	> Created Time: 2019年05月11日 星期六 23时10分17秒
 ************************************************************************/
import java.io.FileInputStream;
import java.io.IOException;
public class AccessExceptionMsg {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("a.txt");
        } catch(IOException ioe) {
            System.out.println(ioe.getMessage());
            ioe.printStackTrace();
        }
    }
}
