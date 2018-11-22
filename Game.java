/*************************************************************************
	> File Name: Game.java
	> Author: 
	> Mail: 
	> Created Time: 2018年11月22日 星期四 22时33分55秒
 ************************************************************************/
import static java.lang.System.out;

enum Action {
    STOP,RIGHT,LEFT,UP,DOWN
}
public class Game {
    public static void main(String[] args) {
        play(Action.RIGHT);
        play(Action.UP);
    }

    public static void play(Action action) {
        switch(action) {
            case STOP:
                out.println("播放停止动画");
                break;
            case RIGHT:
                out.println("播放向右动画");
                break;
            case LEFT:
                out.println("播放向上动画");
                break;
            case UP:
                out.println("播放向上动画");
                break;
            case DOWN:
                out.println("播放向下动画");
                break;
        }
    }
}
