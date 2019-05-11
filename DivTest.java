/*************************************************************************
	> File Name: DivTest.java
	> Author: 
	> Mail: 
	> Created Time: 2019年05月11日 星期六 22时47分38秒
 ************************************************************************/

public class DivTest {
    public static void main(String[] args) {
        try {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            int c = a / b;
            System.out.println("您输入的两个数相除的结果是：" + c);
        } catch(IndexOutOfBoundsException ie) {
            System.out.println("数组越界");
        } catch(NumberFormatException ne) {
            System.out.println("数字格式异常");
        } catch(ArithmeticException ae) {
            System.out.println("算术异常");
        } catch(Exception e) {
            System.out.println("未知异常");
        }
    }
}
