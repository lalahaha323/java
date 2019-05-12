/*************************************************************************
	> File Name: PrintStackTraceTest.java
	> Author: 
	> Mail: 
	> Created Time: 2019年05月12日 星期日 11时58分29秒
 ************************************************************************/
class SelfException extends RuntimeException {
    SelfException() {}
    SelfException(String msg) {
        super(msg);
    }
}
public class PrintStackTraceTest {
    public static void main(String[] args) {
        firstMethod();
    }
    public static void firstMethod() {
        secondMethod();
    }
    public static void secondMethod() {
        thirdMethod();
    }
    public static void thirdMethod() {
        throw new SelfException("自定义异常信息");
    }
}
