/*************************************************************************
	> File Name: FunInterface.java
	> Author: 
	> Mail: 
	> Created Time: 2019年05月12日 星期日 16时27分41秒
 ************************************************************************/
@FunctionalInterface
public interface FunInterface {
    static void foo() {
        System.out.println("foo类方法");
    }
    default void bar() {
        System.out.println("bar默认方法");
    }
    void test();
    //void bar1(); 只能有一个抽象方法
}
