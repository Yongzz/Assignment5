package za.ac.cput.facadePatternDemo;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by student on 2015/03/10.
 */
public class TobeHappyTest extends TestCase{
    @Test
    public void testBeHappy() throws Exception {
        TobeHappy tobeHappy = new TobeHappy();

        assertEquals("Progress to the next level",tobeHappy.beHAppyAtSchool());

    }
}
