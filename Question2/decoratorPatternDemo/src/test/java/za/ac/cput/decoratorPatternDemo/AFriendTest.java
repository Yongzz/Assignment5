package za.ac.cput.decoratorPatternDemo;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by student on 2015/03/11.
 */
public class AFriendTest extends TestCase{

    @Test
    public void testGetDescription() throws Exception {
        AFriend aFriend = new SchoolFriend();

        Programming programming = new Programming(aFriend);

        assertEquals("School Friend Always talk about developing cool apps", programming.getDescription());




    }
}
