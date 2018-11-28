/*************************************************************************
	> File Name: HowOld.java
	> Author: 
	> Mail: 
	> Created Time: 2018年11月28日 星期三 23时01分53秒
 ************************************************************************/
import java.util.*;
import java.text.*;

public class HowOld {
    public static void main(String[] args) throws Exception {
        System.out.println("输入出生年月(yyyy-mm-dd)：");
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
        Date birthDate = dateFormat.parse(new Scanner(System.in).nextLine());
        Date currentDate = new Date();
        long life = currentDate.getTime() - birthDate.getTime();
        System.out.println("你今年的岁数是: " + (life / (365 * 24 * 60 * 60 * 1000L)));
    }
}
