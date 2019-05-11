/*************************************************************************
	> File Name: StartEnd.java
	> Author: 
	> Mail: 
	> Created Time: 2019年05月11日 星期六 20时31分14秒
 ************************************************************************/
import java.util.regex.*;
public class StartEnd {
    public static void main(String[] args) {
        String regStr = "Java is very easy";
        System.out.println("目标字符串是：" + regStr);
        Matcher m = Pattern.compile("\\w+").matcher(regStr);
        while(m.find()) {
            System.out.println(m.group() + "子串起始的位置：" + m.start() + "，其结束位置：" + m.end());
        }
    }
}
