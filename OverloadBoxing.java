/*************************************************************************
	> File Name: OverloadBoxing.java
	> Author: 
	> Mail: 
	> Created Time: 2018年11月22日 星期四 14时52分38秒
 ************************************************************************/
class Some {
    void someMethod(int i) {
        System.out.println("int 版本被调用");
    }
    void someMethod(Integer integer) {
        System.out.println("Integer版本被调用");
    }
}
public class OverloadBoxing {
    public static void main(String[] args) {
        Some s = new Some();
        s.someMethod(1);
    }
}

