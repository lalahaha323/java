/*************************************************************************
	> File Name: PropertiesTest.java
	> Author: 
	> Mail: 
	> Created Time: 2019年05月07日 星期二 17时35分41秒
 ************************************************************************/
import java.util.*;
import java.io.*;
public class PropertiesTest {
    public static void main(String[] args) throws Exception {
        Properties props = new Properties();
        props.setProperty("username", "yeeku");
        props.setProperty("password", "123456");
        props.store(new FileOutputStream("a.cnf"), "comment line");
        Properties props2 = new Properties();
        props2.setProperty("gender", "male");
        props2.load(new FileInputStream("a.cnf"));
        System.out.println(props2);
    }
}

