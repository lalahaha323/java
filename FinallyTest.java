/*************************************************************************
	> File Name: FinallyTest.java
	> Author: 
	> Mail: 
	> Created Time: 2019年05月12日 星期日 11时01分48秒
 ************************************************************************/
import java.io.*;
public class FinallyTest {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("a.txt");
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
            return;
            //使用exit退出虚拟机
            //System.exit(1);
        }
        finally {
            //关闭磁盘文件，回收资源
            if(fis != null) {
                try {
                    fis.close();
                } catch(IOException ioe) {
                    ioe.printStackTrace();
                }
            }
            System.out.println("执行finally块里的资源回收！");
        }
    }
}
