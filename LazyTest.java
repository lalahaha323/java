/*************************************************************************
	> File Name: LazyTest.java
	> Author: 
	> Mail: 
	> Created Time: 2019年05月11日 星期六 17时25分28秒
 ************************************************************************/
import java.util.Calendar;
import static java.util.Calendar.MONTH;
import static java.util.Calendar.DATE;
public class LazyTest {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.set(2003, 7, 31);
        cal.set(MONTH, 8);
        System.out.println(cal.getTime());
        cal.set(DATE, 5);
        System.out.println(cal.getTime());
    }
}
