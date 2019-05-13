/*************************************************************************
	> File Name: ProcessorTest.java
	> Author: 
	> Mail: 
	> Created Time: 2019年05月12日 星期日 17时07分56秒
 ************************************************************************/
import java.lang.reflect.*;
public class ProcessorTest { 
    public static void process(String clazz) throws ClassNotFoundException {
        int passed = 0;
        int failed = 0;
        for(Method m : Class.forName(clazz).getMethods()) {
            if(m.isAnnotationPresent(Testable.class)) {
                try {
                    m.invoke(null);
                    passed++;
                } catch (Exception ex) {
                    System.out.println("方法" + m + "运行失败，异常：" + ex.getCause());
                    failed++;
                }
            }
        }
        System.out.println("公运行了： " + (passed + failed) + "个方法，其中：\n" + "失败了：" + failed + "个，\n" + "成功了：" + passed + "个！");
    }
}
