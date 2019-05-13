/*************************************************************************
	> File Name: FileTest3.java
	> Author: 
	> Mail: 
	> Created Time: 2019年05月13日 星期一 17时57分52秒
 ************************************************************************/
import java.io.*;
public class FileTest3 {
    public static void main(String[] args) throws Exception{
        File newFile = new File("aaa");
        File file = new File(".");
        newFile.createNewFile();
        System.out.println(newFile.mkdir());
        String[] fileList = file.list();
        System.out.println("当前路径下所有文件：");
        for(String fileName : fileList) {
            System.out.println(fileName);
        }
        File[] roots = File.listRoots();
        System.out.println("系统所有根路径如下：");
        for(File root : roots) {
            System.out.println(root);
        }
    }
}

