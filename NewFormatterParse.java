/*************************************************************************
	> File Name: NewFormatterParse.java
	> Author: 
	> Mail: 
	> Created Time: 2019年05月11日 星期六 22时12分27秒
 ************************************************************************/
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class NewFormatterParse {
    public static void main(String[] args) {
        String str1 = "2014==04==12 01时06分09秒";
        DateTimeFormatter fomatter1 = DateTimeFormatter.ofPattern("yyyy==MM==dd HH时mm分ss秒");
        LocalDateTime dt1 = LocalDateTime.parse(str1, fomatter1);
        System.out.println(dt1);
/*
        String str2 = "2014$$11月$$13 20小时";
        DateTimeFormatter fomatter2 = DateTimeFormatter.ofPattern("yyy$$MM$$dd HH小时");
        LocalDateTime dt2 = LocalDateTime.parse(str2, fomatter2);
        System.out.println(dt2);*/
    }
}
