/*************************************************************************
	> File Name: FileTest2.java
	> Author: 
	> Mail: 
	> Created Time: 2019年05月13日 星期一 17时53分50秒
 ************************************************************************/
import java.io.*;
public class FileTest2 {
    public static void main(String[] args) throws IOException {
        File file = new File(".");
        File tmpFile = File.createTempFile("aaa", ".txt", file);
        tmpFile.deleteOnExit();
        File newFile = new File(System.currentTimeMillis() + "");
        System.out.println("newFile对象是否存在：" + newFile.exists());

    }
}
