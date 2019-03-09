import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class ShowCurrentTime2 {
    public static void main(String[] args) {
        long totalMilliSeconds = System.currentTimeMillis();

        DateFormat dateFormatterChina = DateFormat.getDateTimeInstance(DateFormat.MEDIUM,DateFormat.MEDIUM);
        TimeZone timeZoneChina = TimeZone.getTimeZone("Asia/Shanghai");
        dateFormatterChina.setTimeZone(timeZoneChina);
        long totalSeconds = totalMilliSeconds / 1000;

        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHour = totalMinutes / 60;
        long currentHour = totalHour % 24;

        System.out.println("总毫秒为： " + totalMilliSeconds);
        System.out.println(currentHour + ": " + currentMinute + ":" + currentSecond + " GMT");

        Date nowTime = new Date(System.currentTimeMillis());
        System.out.println(System.currentTimeMillis());
        SimpleDateFormat sdFormatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:dd");
        String retStrFormatNowDate = sdFormatter.format(nowTime);
        System.out.println(retStrFormatNowDate);
    }
}