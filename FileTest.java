/*************************************************************************
	> File Name: FileTest.java
	> Author: 
	> Mail: 
	> Created Time: 2019年05月13日 星期一 16时44分36秒
 ************************************************************************/
import java.io.*;
public class FileTest {
    public static void main(String[] args) throws IOException {
        //基础用法一
        File file = new File("a.txt");
        File file2 = new File("c.txt");
        System.out.println("File对象所表示的文件名：" + file.getName());
        System.out.println("File对象所对应的路径：" + file.getPath());
        System.out.println("File对象所对应的绝对路径名：" + file.getAbsolutePath());
        System.out.println("File对象所对应的父路径名：" + file.getAbsoluteFile().getParent());
        System.out.println("重命名此File对象所对应的文件，是否成功：" + file.renameTo(file2));
        //文件检测的相关方法
        System.out.println("File对象所对应的文件是否存在：" + file.exists());
        System.out.println("File对象所对应的文件是否可写：" + file.canWrite());
        System.out.println("File对象所对应的文件是否可读：" + file.canRead());
        System.out.println("是否是一个文件：" + file.isFile());
        System.out.println("是否是一个目录：" + file.isDirectory());
        System.out.println("是否是一个绝对路径：" + file.isAbsolute());
        System.out.println("文件最后的修改时间是：" + file.lastModified());
        System.out.println("文件内容的长度：" + file.length());
        //文件操作相关的方法

    }
}
