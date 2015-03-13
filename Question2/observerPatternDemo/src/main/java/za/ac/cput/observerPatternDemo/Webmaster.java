package za.ac.cput.observerPatternDemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by student on 2015/03/12.
 */
public class Webmaster implements FootGameScoreSubject{

    Set<LivescoreObsever> livescoreObsevers;
    int t1Score,t2Score;
    Webmaster()
    {
        livescoreObsevers = new HashSet<LivescoreObsever>();
    }
    @Override
    public void addObserver(LivescoreObsever livescoreObsever) {
        livescoreObsevers.add(livescoreObsever);
    }

    @Override
    public void removeObserver(LivescoreObsever livescoreObsever) {
        livescoreObsevers.add(livescoreObsever);
    }

    @Override
    public void doNotify() {
        Iterator<LivescoreObsever> i = livescoreObsevers.iterator();
        while(i.hasNext())
        {
            LivescoreObsever l = i.next();
            l.updateScore(t1Score,t2Score);
        }
    }

    public void setScore(int t1,int t2)
    {
        t1Score = t1;
        t2Score = t2;
        doNotify();
    }
}
