package za.ac.cput.singleTonPatternTestDemo;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by student on 2015/03/13.
 */
public class CalculatorTest extends TestCase{


    @Test
    public void testGetInstance() throws Exception {
        Calculator calculator1 = Calculator.getInstance();
        Calculator calculator2 = Calculator.getInstance();

        assertSame(calculator1,calculator2);


    }
}
