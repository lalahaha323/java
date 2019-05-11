/*************************************************************************
	> File Name: NullTest.java
	> Author: 
	> Mail: 
	> Created Time: 2019年05月11日 星期六 22时53分58秒
 ************************************************************************/
import java.util.Date;
public class NullTest {
    public static void main(String[] args) {
        Date d = null;
        try {
            System.out.println(d.after(new Date()));
        } catch(NullPointerException ne) {
            System.out.println("空指针异常");
        } catch(Exception e) {
            System.out.println("未知异常");
        }
    }
}
