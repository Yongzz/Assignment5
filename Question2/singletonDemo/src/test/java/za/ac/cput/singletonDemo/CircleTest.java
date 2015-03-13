package za.ac.cput.singletonDemo;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by student on 2015/03/03.
 */
public class CircleTest extends TestCase{

    @Test
    public void testGetInstance() throws Exception {
        Circle c;
        Circle circle;
        c = Circle.getInstance();
        circle = Circle.getInstance();

        c.calcDiameter(2);
        circle.calcDiameter(3);
        assertEquals(c.hashCode(),circle.hashCode());


    }
}
