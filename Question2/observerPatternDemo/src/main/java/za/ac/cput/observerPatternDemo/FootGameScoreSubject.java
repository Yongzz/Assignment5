package za.ac.cput.observerPatternDemo;

/**
 * Created by student on 2015/03/12.
 */
public interface FootGameScoreSubject {
    public void addObserver(LivescoreObsever livescoreObsever);

    public void removeObserver(LivescoreObsever weatherObserver);

    public void doNotify();
}
