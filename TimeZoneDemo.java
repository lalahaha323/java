/*************************************************************************
	> File Name: TimeZoneDemo.java
	> Author: 
	> Mail: 
	> Created Time: 2018年11月29日 星期四 08时31分24秒
 ************************************************************************/
import static java.lang.System.out;
import java.util.TimeZone;

public class TimeZoneDemo {
    public static void main(String[] args) {
        TimeZone timeZone = TimeZone.getDefault();
        out.println("\t时区ID: " + timeZone.getID());
        out.println("\t夏令时数: " + timeZone.getDSTSavings());
        out.println("\tUTC 偏移毫秒数: " + timeZone.getRawOffset());
    }
}

