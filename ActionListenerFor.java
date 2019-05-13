/*************************************************************************
	> File Name: ActionListenerFor.java
	> Author: 
	> Mail: 
	> Created Time: 2019年05月12日 星期日 17时20分57秒
 ************************************************************************/
import java.lang.annotation.*;
import java.awt.event.ActionListener;
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface ActionListenerFor {
    Class<? extends ActionListener> listener();
}
