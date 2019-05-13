/*************************************************************************
	> File Name: InheritableTest.java
	> Author: 
	> Mail: 
	> Created Time: 2019年05月12日 星期日 16时37分08秒
 ************************************************************************/
import java.lang.annotation.*;
@Inheritable
class Base {

}
//InheritableTest类只是继承了Base类，并未直接使用@Inheritable Annotiation修饰
public class InheritableTest extends Base {
    public static void main(String[] args) {
        //打印InheritableTest类是否有@Inheritable修饰
        System.out.println(InheritableTest.class.isAnnotationPresent(Inheritable.class));
    }
}
