package za.ac.cput.builderPatternDemo;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by student on 2015/03/07.
 */
public class SandwichTest extends TestCase{
    @Test
    public void testGetTopping() throws Exception {
        Sandwich sandwich;
        SandwichBuilder sandwichBuilder;
        SandwichFactory sandwichFactory = SandwichFactory.getInstance();
        sandwichBuilder = sandwichFactory.getSandwitchType("Apple");
        sandwich =sandwichBuilder.buildSandwich();
        sandwichBuilder.buildBread();
        sandwichBuilder.buildButter();
        sandwichBuilder.buildTopping();

        assertEquals("Apple",sandwich.getTopping());


    }
}
