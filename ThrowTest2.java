/*************************************************************************
	> File Name: ThrowTest2.java
	> Author: 
	> Mail: 
	> Created Time: 2019年05月12日 星期日 11时51分28秒
 ************************************************************************/
import java.io.*;
public class ThrowTest2 {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            new FileOutputStream("a.txt");
        } catch (Exception ex) {
            ex.printStackTrace();
            throw ex;
        }
    }
}
