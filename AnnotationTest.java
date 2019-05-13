/*************************************************************************
	> File Name: AnnotationTest.java
	> Author: 
	> Mail: 
	> Created Time: 2019年05月12日 星期日 17时22分50秒
 ************************************************************************/
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class AnnotationTest {
    private JFrame  mainWin = new JFrame("使用注解绑定事件监听器");
    //使用@ActionListenerFor注解为ok按钮绑定事件监听器
    @ActionListenerFor(listener=OkListener.class)
    private JButton ok = new JButton("确定");
    //使用@ActionListenerFor注解为cancel按钮绑定事件监听器
    @ActionListenerFor(listener=CancelListener.class)
    private JButton cancel = new JButton("取消");
    public void init() {
        //初始化界面的方法
        JPanel jp = new JPanel();
        jp.add(ok);
        jp.add(cancel);
        mainWin.add(jp);
        ActionListenerInstaller.processAnnotations(this);
        mainWin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainWin.pack();
        mainWin.setVisible(true);
    }
    public static void main(String[] args) {
        new AnnotationTest().init();
    }
}
class OkListener implements ActionListener {
    public void actionPerformed(ActionEvent evt) {
        JOptionPane.showMessageDialog(null, "单击确认按钮");
    }
}
class CancelListener implements ActionListener {
    public void actionPerformed(ActionEvent evt) {
        JOptionPane.showMessageDialog(null, "单击取消了按钮");
    }
}

