package za.ac.cput.observerPatternDemo;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by student on 2015/03/12.
 */
public class WebMasterTest extends TestCase{

    @Test
    public void testUpdateScore() throws Exception {
        Webmaster w = new Webmaster();
        WebUser1 user1 = new WebUser1();
        WebUser2 user2 = new WebUser2();
        w.addObserver(user1);
        w.addObserver(user2);

        w.setScore(0, 2);
        //Assert.fail();



    }
}
