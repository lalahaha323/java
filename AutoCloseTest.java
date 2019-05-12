/*************************************************************************
	> File Name: AutoCloseTest.java
	> Author: 
	> Mail: 
	> Created Time: 2019年05月12日 星期日 11时13分51秒
 ************************************************************************/
import java.io.*;
public class AutoCloseTest {
    public static void main(String[] args) throws IOException {
        try (
                //声明，初始化两个可关闭的资源
                //try语句会自动关闭这两个资源
                BufferedReader br = new BufferedReader(new FileReader("AutoCloseTest.java"));
                PrintStream ps = new PrintStream(new FileOutputStream("a.txt"))) {
                System.out.println(br.readLine());
                ps.println("啦啦啦啦啦");
            }
    }
}
