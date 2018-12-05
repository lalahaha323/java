/*************************************************************************
	> File Name: ThreadGroupDemo2.java
	> Author: 
	> Mail: 
	> Created Time: 2018年12月05日 星期三 19时44分53秒
 ************************************************************************/

public class ThreadGroupDemo2 {
    public static void main(String[] args) {
        ThreadGroup group = new ThreadGroup("group");
        Thread thread1 = new Thread(group, () -> {
            throw new RuntimeException("thread1 测试例外");
        });
        thread1.setUncaughtExceptionHandler((thread, throwable) -> {
            System.out.printf("%s: %s%n",thread.getName(), throwable.getMessage());
        });
        Thread thread2 = new Thread(group, () -> {
            throw new RuntimeException("thread2 测试异常");
        });
        thread1.start();
        thread2.start();
    }
}
