/*************************************************************************
	> File Name: LenientTest.java
	> Author: 
	> Mail: 
	> Created Time: 2019年05月11日 星期六 17时18分42秒
 ************************************************************************/
import java.util.Calendar;
import static java.util.Calendar.MONTH;
public class LenientTest {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.set(MONTH, 13);
        System.out.println(cal.getTime());
        cal.setLenient(false);
        cal.set(MONTH, 13);
        System.out.println(cal.getTime());
    }
}
