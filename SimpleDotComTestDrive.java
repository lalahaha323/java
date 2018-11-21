/*************************************************************************
	> File Name: SimpleDotComTestDrive.java
	> Author: 
	> Mail: 
	> Created Time: 2018年11月21日 星期三 19时49分24秒
 ************************************************************************/
class SimpleDotCom {
    int[] locationCells;
    int numOfHits = 0;
    public void setLocationCells(int[] locs) {
        locationCells = locs;
    }
    public String checkYourself(String stringGuess) {
        int guess = Integer.parseInt(stringGuess);
        String result = "miss";
        for(int cell : locationCells) {
            if(guess == cell) {
                result = "hit";
                numOfHits++;
                break;
            }
        }
        if(numOfHits == locationCells.length) {
            result = "kill";
        }
        System.out.println(result);
        return result;
    }
}
public class SimpleDotComTestDrive {
    public static void main(String[] args) {
        SimpleDotCom dot = new SimpleDotCom();
        int[] locations = {2,3,4};
        dot.setLocationCells(locations);
        String userGuess = "2";
        String result = dot.checkYourself(userGuess);
    }
}
