/*************************************************************************
	> File Name: TimeZoneDemo2.java
	> Author: 
	> Mail: 
	> Created Time: 2018年11月29日 星期四 08时47分26秒
 ************************************************************************/
import java.util.*;
import static java.lang.System.out;

public class TimeZoneDemo2 {
    public static void main(String[] args) {
        TimeZone taipeiTz = TimeZone.getTimeZone("Asia/Taipei");
        Calendar calendar = Calendar.getInstance(taipeiTz);
        showTime(calendar);

        TimeZone copenhagenTz = TimeZone.getTimeZone("Europe/Copenhagen");
        calendar.setTimeZone(copenhagenTz);
        showTime(calendar);
    }

    static void showTime(Calendar calendar) {
        out.println(calendar.getTimeZone().getDisplayName());
        out.printf(" %d:%d%n", 
                calendar.get(Calendar.HOUR),
                calendar.get(Calendar.MINUTE));
    }
}

