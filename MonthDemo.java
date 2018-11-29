/*************************************************************************
	> File Name: MonthDemo.java
	> Author: 
	> Mail: 
	> Created Time: 2018年11月29日 星期四 09时06分33秒
 ************************************************************************/
import static java.lang.System.out;
import java.time.Month;

public class MonthDemo {
    public static void main(String[] args) {
        for(Month month : Month.values()) {
            out.printf("original: %d\tvalue: %d\t%s%n",month.ordinal(),month.getValue(), month);
        }
    }
}

