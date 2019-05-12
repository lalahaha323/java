/*************************************************************************
	> File Name: ThrowsTest2.java
	> Author: 
	> Mail: 
	> Created Time: 2019年05月12日 星期日 11时27分35秒
 ************************************************************************/
import java.io.*;
public class ThrowsTest2 {
    public static void main(String[] args) throws Exception {
        
        test();
    }
    public static void test() throws IOException {
        FileInputStream fis = new FileInputStream("a.txt");
    }
}
