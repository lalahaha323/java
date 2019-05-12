/*************************************************************************
	> File Name: AutoCloseTest2.java
	> Author: 
	> Mail: 
	> Created Time: 2019年05月12日 星期日 11时18分48秒
 ************************************************************************/
import java.io.*;
public class AutoCloseTest2 {
    public static void main(String[] args) throws IOException {
        final BufferedReader br = new BufferedReader(new FileReader("AutoCloseTest.java"));
        //没有显式使用final修饰，但只要不对该变量重新赋值，该变量就是有效的final
        PrintStream ps = new PrintStream(new FileOutputStream("a.txt"));
        //只要将两个资源放在try后面的圆括号即可
        try(br;ps) {
            //使用两个资源
            System.out.println(br.readLine());
            ps.println("lalala");
        }
    }
}
