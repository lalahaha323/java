/*************************************************************************
	> File Name: ActionListenerInstaller.java
	> Author: 
	> Mail: 
	> Created Time: 2019年05月12日 星期日 17时32分22秒
 ************************************************************************/
import java.lang.reflect.Field;
import java.awt.event.ActionListener;
import javax.swing.*;
public class ActionListenerInstaller {
    public static void processAnnotations(Object obj) {
        try {
            Class c1 = obj.getClass();
            for(Field f : c1.getDeclaredFields()) {
                f.setAccessible(true);
                ActionListenerFor a = f.getAnnotation(ActionListenerFor.class);
                Object fObj = f.get(obj);
                if(a != null && fObj != null && fObj instanceof AbstractButton) {
                    Class<? extends ActionListener> listenerClazz = a.listener();
                    ActionListener a1 = listenerClazz.newInstance();
                    AbstractButton ab = (AbstractButton)fObj;
                    ab.addActionListener(a1);
                }
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
