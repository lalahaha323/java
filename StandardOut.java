/*************************************************************************
	> File Name: StandardOut.java
	> Author: 
	> Mail: 
	> Created Time: 2018年12月05日 星期三 15时59分05秒
 ************************************************************************/

import java.io.*;

public class StandardOut {
    public static void main(String[] args) throws IOException {
        try (PrintStream printStream = new PrintStream(new FileOutputStream(args[0]))) {
            System.setOut(printStream);
            System.out.println("HelloWorld");
        }
    }
}

