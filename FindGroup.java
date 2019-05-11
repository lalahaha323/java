/*************************************************************************
	> File Name: FindGroup.java
	> Author: 
	> Mail: 
	> Created Time: 2019年05月11日 星期六 18时34分37秒
 ************************************************************************/
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class FindGroup {
    public static void main(String[] args) {
        String str = "我想求购一本《疯狂Java讲义》，尽快联系我13500006666" + "交朋友，电话号码是13611125565" + "出售二手电脑，联系方式15899903312";
        Matcher m = Pattern.compile("((13)|(15))\\d{9}").matcher(str);
        while(m.find()) {
            System.out.println(m.group());
        }
    }
}
