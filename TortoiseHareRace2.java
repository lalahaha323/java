/*************************************************************************
	> File Name: TortoiseHareRace2.java
	> Author: 
	> Mail: 
	> Created Time: 2018年12月05日 星期三 18时08分01秒
 ************************************************************************/
class Tortoise implements Runnable {
    private int totalStep;
    private int step;
    public Tortoise(int totalStep) {
        this.totalStep = totalStep;
    }
    @Override
    public void run() {
        while(step < totalStep) {
            step++;
            System.out.printf("乌龟跑了 %d步...%n", step);
        }
    }
}

class Hare implements Runnable {
    private boolean[] flags = {true,false};
    private int totalStep;
    private int step;
    public Hare(int totalStep) {
        this.totalStep = totalStep;
    }
    @Override
    public void run() {
        while(step < totalStep) {
            boolean isHareSleep = flags[((int) (Math.random() * 10)) % 2];
            if(isHareSleep) {
                System.out.println("兔子睡着了 zzzz");
            } else {
                step += 2;
                System.out.printf("兔子跑了 %d步...%n", step);
            }
        }
    }
}
public class TortoiseHareRace2 {
    public static void main(String[] args) {
        Tortoise tortoise = new Tortoise(10);
        Hare hare = new Hare(10);
        Thread tortoiseThread =  new Thread(tortoise);
        Thread hareThread = new Thread(hare);
        tortoiseThread.start();
        hareThread.start();
    }
}

