/*************************************************************************
	> File Name: FkTags.java
	> Author: 
	> Mail: 
	> Created Time: 2019年05月12日 星期日 17时56分32秒
 ************************************************************************/
import java.lang.annotation.*;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface FkTags {
    FkTag[] value();
}

