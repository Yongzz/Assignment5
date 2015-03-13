package za.ac.cput.mementoPatternDemo;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by student on 2015/03/13.
 */
public class StudyInfoTest extends TestCase{
    @Test
    public void testStudInfo() throws Exception {
        StudyInfoCareTaker careTake = new StudyInfoCareTaker();
        StudyInfo studyInfo = new StudyInfo("TP","Design Patterns",5);
        careTake.saveState(studyInfo);
        System.out.println(studyInfo);
        studyInfo.setTopicAndChapter("Domain Driven Design",6);
        careTake.restoreState(studyInfo);
        assertEquals("Subject : TP Topic : Design Patterns Chapter : 5", studyInfo.toString());


    }
}
