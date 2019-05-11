/*************************************************************************
	> File Name: NewDatePackageTest.java
	> Author: 
	> Mail: 
	> Created Time: 2019年05月11日 星期六 17时37分12秒
 ************************************************************************/
import java.time.*;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
public class NewDatePackageTest {
    public static void main(String[] args) {
        //下面是关于clock的用法
        //获取当前Clock
        Clock clock = Clock.systemUTC();
        //通过Clock获取当前时刻
        System.out.println("当前时刻： " + clock.instant());
        //获取clock对应的毫秒数，与System.currentTimeMillis()输出相同
        System.out.println(clock.millis());
        System.out.println(System.currentTimeMillis());
       
        //关于Duration的用法
        Duration d = Duration.ofSeconds(6000);
        System.out.println("6000秒相当于" + d.toMinutes() + "分");
        System.out.println("6000秒相当于" + d.toHours() + "小时");
        System.out.println("6000秒相当于" + d.toDays() + "天");
        //在clock基础上增加6000秒，返回新的Clock
        Clock clock2 = Clock.offset(clock, d);
        System.out.println("当前时刻加6000秒为：" + clock2.instant());
       
        //关于instant的用法
        //获取当前时间
        Instant instant = Instant.now();
        System.out.println(instant);
        //instant添加6000秒（即100分钟），返回新的instant
        Instant instant2 = instant.plusSeconds(6000);
        System.out.println(instant2);
        //根据字符串解析Instant对象
        Instant instant3 = Instant.parse("2014-02-23T10:12:35.342z");
        System.out.println(instant3);
        //在instant3的基础上添加5小时4分钟
        Instant instant4 = instant3.plus(Duration.ofHours(5).plusMinutes(4));
        System.out.println(instant4);
        //获取instant4的5天以前的时刻
        Instant instant5 = instant4.minus(Duration.ofDays(5));
        System.out.println(instant5);

        //关于LocalDate的用法
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        //获得2014年的第146天
        localDate = LocalDate.ofYearDay(2014, 146);
        System.out.println(localDate);
        //设置为2014年5月21日
        localDate = LocalDate.of(2014, Month.MAY, 21);
        System.out.println(localDate);
        
        //关于LocalTime的用法
        //获取当前时间
        LocalTime localTime = LocalTime.now();
        //设置为22点30分
        localTime = LocalTime.of(22, 23);
        System.out.println(localTime);
        //返回一天中的5503秒
        localTime = LocalTime.ofSecondOfDay(5503);
        System.out.println(localTime);

        //关于localDateTime的用法
        //获取当前时间，日期
        LocalDateTime localDateTime = LocalDateTime.now();
        //当前日期时间加上35小时3分钟
        LocalDateTime future = localDateTime.plusHours(35).plusMinutes(3);
        System.out.println(future);

        //关于Year，YearMonth，MonthDay的用法
        Year year = Year.now();
        System.out.println("当前年份：" + year);
        year = year.plusYears(5);
        System.out.println("当前年份再过5年：" + year);
        //根据指定月份获取YearMonth
        YearMonth ym = year.atMonth(10);
        System.out.println("year年10月：" + ym);
        //当前年月再加5年，减3个月
        ym = ym.plusYears(5).minusMonths(3);
        System.out.println("year年10月再加5年，减3个月： " + ym);
        MonthDay md = MonthDay.now();
        System.out.println("当前月日：" + md);
        MonthDay md2 = md.with(Month.MAY).withDayOfMonth(23);
        System.out.println("5月23日为：" + md2);
    } 
}
