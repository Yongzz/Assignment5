package za.ac.cput.bridgePatternDemo;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by student on 2015/03/11.
 */
public class RemoteControlTest  extends TestCase{
    @Test
    public void testOn() throws Exception {
        DVD dvd = new DVD("DVD");
        AirConditioner airConditioner = new AirConditioner("AirConditioner");

        RemoteControl r1 = new RemoteControl(dvd);
        RemoteControl r2 = new RemoteControl(airConditioner);

        assertEquals("Running AirConditioner",r2.on());



    }
}
