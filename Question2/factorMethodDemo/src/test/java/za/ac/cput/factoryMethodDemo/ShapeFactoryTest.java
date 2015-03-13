package za.ac.cput.factoryMethodDemo;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by student on 2015/03/04.
 */
public class ShapeFactoryTest extends TestCase{
    private ShapeFactory c;
    private Shape shapetype;

    @Test
    public void testGetShapeType() throws Exception {
        c = ShapeFactory.getInstance();

        shapetype = c.getShapeType("Circle");
        assertTrue(shapetype instanceof Circle);

    }
}
