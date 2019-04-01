import java.util.*;

class Canlender {
    public int year;
    public int month;
    public int day;
    public int flag;

    public int outPut(int num, int d_month) {
        if((d_month == 1) || (d_month == 3) || (d_month == 5) || (d_month == 7) || (d_month == 8) || (d_month == 10) || (d_month == 12)) {
            return 31;
        } else if (d_month == 2) {
            if(num == 1) {
                return 29;
            } else {
                return 28;
            }
        } else {
            return 30;
        }
    }
    public int countDays(int d_year, int d_month, int d_day) {
        int total = 0;
        for(int i = 1;i < d_year; i++) {
            if(this.isLeapYear(i)) {
                total += 366;
            } else {
                total += 365;
            }
        }
        for(int i = 1; i < d_month; i++) {
            if(this.flag == 1) {
                total += outPut(1, i);
            } else {
                total += outPut(2, i);
            }
        }
        return (total += d_day);
    }

    public boolean isLeapYear(int d_year) {
        if((d_year % 4 == 0 && d_year % 100 != 0) || (d_year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    public void printMonth(int d_year, int d_month, int time) {
        int sum;
        int startDay;
        System.out.printf("%d年%d月有%d天%n", d_year, d_month, time);
        System.out.println("  日  一  二  三  四  五  六");
        System.out.println("|---|---|---|---|---|---|---|");

        startDay = this.getStartDay(d_year, d_month, 1);

        for(int i = 0; i < startDay * 4; i++) {
            System.out.print(" ");
        }
        if(this.isLeapYear(d_year)) {
            sum = this.outPut(1, d_month);
        } else {
            sum = this.outPut(2, d_month);
        }
        for(int i = 1; i < sum + 1; i++) {
            System.out.printf("%4d", i);

            if((i + startDay) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    public int getStartDay(int y, int m, int d) {
        int a = y % 100;
        int b = y / 100;
        int c = m < 3 ? (m + 12) : month;
        if(m == 1 || m == 2)
            a--;
        return ((a + a / 4 + b / 4 - 2 * b + 26 * (c + 1) / 10 + 7) % 7);
    } 
}

public class TestCanlender {
    public static void main(String[] args) {
        int time;
        Canlender canlender = new Canlender();
        System.out.println("请输入年月日：");
        Scanner in = new Scanner(System.in);
        canlender.year = in.nextInt();
        canlender.month = in.nextInt();
        canlender.day = in.nextInt();
        if(canlender.isLeapYear(canlender.year)) {
            canlender.flag = 1;
            time = canlender.outPut(1, canlender.month);
        } else {
            canlender.flag = 2;
            time = canlender.outPut(2, canlender.month);
        }
        canlender.printMonth(canlender.year, canlender.month, time);
        System.out.println("从公元元年至2019年1月1日已有" + canlender.countDays(canlender.year, canlender.month, canlender.day) + "天");
    }
}