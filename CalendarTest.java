/*************************************************************************
	> File Name: CalendarTest.java
	> Author: 
	> Mail: 
	> Created Time: 2019年05月11日 星期六 17时08分53秒
 ************************************************************************/
import java.util.Calendar;
import static java.util.Calendar.YEAR;
import static java.util.Calendar.MONTH;
import static java.util.Calendar.DATE;
public class CalendarTest {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(YEAR));
        System.out.println(c.get(MONTH));
        System.out.println(c.get(DATE));
        c.set(2003, 10, 23, 12, 32, 23);
        System.out.println(c.getTime());
        c.add(YEAR, -1);
        System.out.println(c.getTime());
        c.roll(MONTH, -8);
        System.out.println(c.getTime());
    }
}
