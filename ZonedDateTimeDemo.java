/*************************************************************************
	> File Name: ZonedDateTimeDemo.java
	> Author: 
	> Mail: 
	> Created Time: 2018年11月29日 星期四 08时57分59秒
 ************************************************************************/
import java.time.*;
import static java.lang.System.out;

public class ZonedDateTimeDemo {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.of(0, 0, 0);
        LocalDate localDate = LocalDate.of(1975, 4, 1);
        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDate, localTime, ZoneId.of("Asia/Taipei"));
        out.println(zonedDateTime);
        out.println(zonedDateTime.toEpochSecond());
        out.println(zonedDateTime.toInstant().toEpochMilli());
    }
}

