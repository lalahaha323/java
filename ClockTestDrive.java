/*************************************************************************
	> File Name: ClockTestDrive.java
	> Author: 
	> Mail: 
	> Created Time: 2018年11月21日 星期三 19时35分07秒
 ************************************************************************/
class Clock {
    String time;
    void setTime(String t) {
        time = t;
    }
    String getTime() {
        return time;
    }
}
class ClockTestDrive {
    public static void main(String[] args) {
        Clock c = new Clock();
        c.setTime("1245");
        String tod = c.getTime();
        System.out.println("time: " + tod);
    }
}
