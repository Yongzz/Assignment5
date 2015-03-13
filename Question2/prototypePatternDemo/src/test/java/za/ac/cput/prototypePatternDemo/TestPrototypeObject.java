package za.ac.cput.prototypePatternDemo;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by student on 2015/03/08.
 */
public class TestPrototypeObject extends TestCase{







    @Test
    public void testGetName() throws Exception {
        Album album = new Album("This is love");
        Album album1 = (Album) album.doClone();

        assertEquals("This is love",album1.getName());
    }
}
