/*************************************************************************
	> File Name: VarHandleTest.java
	> Author: 
	> Mail: 
	> Created Time: 2019年05月11日 星期六 21时22分45秒
 ************************************************************************/
import java.lang.invoke.*;
class User {
    String name;
    static int MAX_AGE;
}
public class VarHandleTest {
    public static void main(String[] args) throws Throwable{
        String[] sa = new String[]{"Java", "Kotlin", "Go"};
        VarHandle avh = MethodHandles.arrayElementVarHandle(String[].class);
        boolean r = avh.compareAndSet(sa, 2, "Go", "Lua");
        System.out.println(r);
        System.out.println(Arrays.toString(sa));
        System.out.println(avh.get(sa, 1));
        System.out.println(avh.getAndSet(sa, 2, "Swift"));
        System.out.println(Arrays.toString(sa));

        VarHandle vh1 = MethodHandles.lookup().findVarHandle(User.class, "name", String.class);
        User user = new User();
        System.out.println(vh1.get(user));
        vh1.set(user, "孙悟空");
        System.out.println(user.name);
        VarHandle vh2 = MethodHandles.lookup().findStaticVarHandle(User.class, "AMX_AGE", int.class);
        System.out.println(vh2.get());
        vh2.set(100);
        System.out.println(User.MAX_AGE);

    }
}

