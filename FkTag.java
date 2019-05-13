/*************************************************************************
	> File Name: FkTag.java
	> Author: 
	> Mail: 
	> Created Time: 2019年05月12日 星期日 17时54分25秒
 ************************************************************************/

import java.lang.annotation.*;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Repeatable(FkTags.class)
public @interface FkTag {
    String name() default "疯狂软件";
    int age();
}
