package za.ac.cput.statePatternDemo;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by student on 2015/03/13.
 */
public class BattrySavingPlanTest extends TestCase{
    @Test
    public void testBrightnessLevel() throws Exception {

        BattrySavingPlan bsp = new BattrySavingPlan(new OnBattryState());
        BattrySavingPlan bsp1 = new BattrySavingPlan(new PlugginState());

        System.out.println("Brightness Level on battry state : " + bsp1.brightnessLevel() + "\n");
        System.out.println("Brightness Level in plugin state : "+bsp.brightnessLevel());
        assertEquals("50%",bsp.brightnessLevel());


    }
}
