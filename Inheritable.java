/*************************************************************************
	> File Name: Inheritable.java
	> Author: 
	> Mail: 
	> Created Time: 2019年05月12日 星期日 16时47分58秒
 ************************************************************************/
import java.lang.annotation.*;
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface Inheritable {
    
}

