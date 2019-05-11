/*************************************************************************
	> File Name: StringReg.java
	> Author: 
	> Mail: 
	> Created Time: 2019年05月11日 星期六 21时00分51秒
 ************************************************************************/
import java.util.regex.*;
import java.util.*;
public class StringReg {
    public static void main(String[] args) {
        String[] msgs = {
            "Java has regular expressions in 1.4",
            "regular expressions now expressing in Java",
            "Java represses oracular expressions"
        };
        for(String msg : msgs) {
            System.out.println(msg.replaceFirst("re\\w*", "哈哈："));
            System.out.println(Arrays.toString(msg.split(" ")));
        }
    }
}
