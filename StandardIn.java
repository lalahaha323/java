/*************************************************************************
	> File Name: Standardin.java
	> Author: 
	> Mail: 
	> Created Time: 2018年12月05日 星期三 15时50分14秒
 ************************************************************************/
import java.io.*;
import java.util.*;

public class StandardIn {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream(args[0]));
        try(Scanner file = new Scanner(System.in)) {
            while(file.hasNextLine()) {
                System.out.println(file.nextLine());
            }
        }
    }
}
