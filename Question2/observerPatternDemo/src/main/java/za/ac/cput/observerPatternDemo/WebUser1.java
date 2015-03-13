package za.ac.cput.observerPatternDemo;

/**
 * Created by student on 2015/03/12.
 */
public class WebUser1 implements LivescoreObsever{
    @Override
    public void updateScore(int team1Score, int team2Score) {
        System.out.println("User1:  "+"Team 1: "+team1Score+" Team 2: "+team2Score);
    }
}
