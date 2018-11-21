/*************************************************************************
	> File Name: DrumKitTestDrive.java
	> Author: 
	> Mail: 
	> Created Time: 2018年11月20日 星期二 23时00分41秒
 ************************************************************************/
class DrumKit {
    boolean topHat = true;
    boolean snare = true;
    void playSnare() {
        System.out.println("bang bang ba-bang");
    }
    void playTopHat() {
        System.out.println("ding ding da-ding");
    }
}
class DrumKitTestDrive {
    public static void main(String[] args) {
        DrumKit d = new DrumKit();
        d.playSnare();
        d.snare = false;     
        if (d.snare == true) {
            d.playSnare();
        }
        d.playTopHat();
    }
}

