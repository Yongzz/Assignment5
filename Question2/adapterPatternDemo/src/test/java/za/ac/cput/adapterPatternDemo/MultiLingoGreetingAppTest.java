package za.ac.cput.adapterPatternDemo;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2015/03/10.
 */
public class MultiLingoGreetingAppTest extends TestCase{

    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void testGreetingMsg() throws Exception {
        MultiLingoGreetingApp multiLingoGreetingApp = new MultiLingoGreetingApp();
        assertEquals("Molo",multiLingoGreetingApp.greetingMsg("Xhosa"));
    }
}
