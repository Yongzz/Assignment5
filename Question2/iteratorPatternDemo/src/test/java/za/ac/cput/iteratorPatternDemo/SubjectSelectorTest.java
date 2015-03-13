package za.ac.cput.iteratorPatternDemo;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.Iterator;

/**
 * Created by student on 2015/03/12.
 */
public class SubjectSelectorTest extends TestCase{
    @Test
    public void testName() throws Exception {

        Subject subject1 = new Subject("Development Software II","DOS300");
        Subject subject2 = new Subject("Internet Programming","IP300");
        Subject subject3 = new Subject("DataBases","DB300");

        SubjectSelector s = new SubjectSelector();
        s.addSubject(subject1);
        s.addSubject(subject2);
        s.addSubject(subject3);

        Iterator<Subject> iterator = s.iterator();
        while (iterator.hasNext())
        {
            System.out.println(s);
        }
        subject1 = null;
        assertNull(subject1);

    }
}
