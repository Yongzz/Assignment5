package za.ac.cput.prototypeTestDemo;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by student on 2015/03/13.
 */
public class PrototypeTest extends TestCase {
    @Test
    public void testName() throws Exception {
        CloneObject c = new Lecturer("Thulebona");
        CloneObject c1;
         c1 = c.makeCopy();
        assertNotSame(c.toString(),c1.toString());

    }
}
