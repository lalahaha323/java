/*************************************************************************
	> File Name: ReplaceTest2.java
	> Author: 
	> Mail: 
	> Created Time: 2019年05月11日 星期六 20时55分24秒
 ************************************************************************/
import java.util.regex.*;
public class ReplaceTest2 {
    public static void main(String[] args) {
        String[] msgs = {
            "Java has regular expressions in 1.4",
            "regular expressions now expressing in Java",
            "Java represses oracular expressions"
        };
        Pattern p = Pattern.compile("re\\w*");
        Matcher matcher = null;
        for(int i = 0; i < msgs.length; i++) {
            if(matcher == null) {
                matcher = p.matcher(msgs[i]);
            } else {
                matcher.reset(msgs[i]);
            }
            System.out.println(matcher.replaceAll("haha:"));
        }
    }
}
