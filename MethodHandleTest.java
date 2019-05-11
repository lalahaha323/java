/*************************************************************************
	> File Name: MethodHandleTest.java
	> Author: 
	> Mail: 
	> Created Time: 2019年05月11日 星期六 21时10分43秒
 ************************************************************************/
import java.lang.invoke.MethodType;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
public class MethodHandleTest {
    private static void hello() {
        System.out.println("Hello world!");
    }
    private String hello(String name) {
        System.out.println("执行带采纳数的hello" + name);
        return name + "，你好";
    }
    public static void main(String[] args) throws Throwable {
        MethodType type = MethodType.methodType(void.class);
        MethodHandle mtd = MethodHandles.lookup().findStatic(MethodHandleTest.class, "hello", type);
        mtd.invoke();
        MethodHandle mtd2 = MethodHandles.lookup().findVirtual(MethodHandleTest.class, "hello", MethodType.methodType(String.class, String.class));
        System.out.println(mtd2.invoke(new MethodHandleTest(), "孙悟空"));
    }
}
