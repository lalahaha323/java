/*************************************************************************
	> File Name: DaemonDemo.java
	> Author: 
	> Mail: 
	> Created Time: 2018年12月05日 星期三 18时56分31秒
 ************************************************************************/

public class DaemonDemo {
    public static void main(String[] args) {
        Thread thread = new Thread() {
            public void run() {
                while(true) {
                    System.out.println("Orz");
                }
            }
        };
        //thread.setDaemon(true);
        thread.start();
    }
}
