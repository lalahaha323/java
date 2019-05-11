/*************************************************************************
	> File Name: SystemTest.java
	> Author: 
	> Mail: 
	> Created Time: 2019年05月10日 星期五 17时19分24秒
 ************************************************************************/
import java.io.*;
import java.util.*;
public class SystemTest {
    public static void main(String[] args) throws Exception{
        Map<String, String> env = System.getenv();
        for(String name : env.keySet()) {
            System.out.println(name + "--->" + env.get(name));
        }
        System.out.println(System.getenv("JDK"));
        Properties props = System.getProperties();
       // props.store(new FileOutputStream("props.txt"), "System Properties");
        System.out.println(System.getProperty("os.name"));
    }
}
