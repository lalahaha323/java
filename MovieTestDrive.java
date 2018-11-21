/*************************************************************************
	> File Name: MovieTestDrive.java
	> Author: 
	> Mail: 
	> Created Time: 2018年11月20日 星期二 22时05分52秒
 ************************************************************************/
class Movie {
    String title;
    String genre;
    int rating;
    
    void playIt() {
        System.out.println("Playing the movie");
    }
}

public class MovieTestDrive {
    public static void main(String[] args) {
        Movie one = new Movie();
        one.title = "Gone with the Stock.";
        one.genre = "Tragic";
        one.rating = -2;
        Movie two = new Movie();
        two.title = "Lost in Cubicle Space.";
        two.genre = "Comedy";
        two.rating = 5;
        two.playIt();
        Movie three = new Movie();
        three.title = "Bye Club.";
        three.genre = "Tragic but ultimately uplifting";
        three.rating = 127;
    }
}

