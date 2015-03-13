package za.ac.cput.mementoPatternDemo;

/**
 * Created by student on 2015/03/13.
 */
public class StudyInfoCareTaker {

    Object objMemento;

    public void saveState(StudyInfo studyInfo) {
        objMemento = studyInfo.save();
    }

    public void restoreState(StudyInfo studyInfo) {
        studyInfo.restore(objMemento);
    }
}
