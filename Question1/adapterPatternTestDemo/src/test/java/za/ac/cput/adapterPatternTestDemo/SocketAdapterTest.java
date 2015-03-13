package za.ac.cput.adapterPatternTestDemo;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by student on 2015/03/13.
 */
public class SocketAdapterTest extends TestCase{

    @Test
    public void testName() throws Exception {
        SocketAdapter socket = new SocketClassAdapter();
        //SocketObjectAdapter s
        socket.get12Volt().setVolts(240);

        assertEquals(24, socket.get12Volt().getVolts());


    }
}
