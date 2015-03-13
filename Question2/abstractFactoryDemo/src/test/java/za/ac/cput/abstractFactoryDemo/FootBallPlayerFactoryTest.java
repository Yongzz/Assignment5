package za.ac.cput.abstractFactoryDemo;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2015/03/07.
 */
public class FootBallPlayerFactoryTest extends TestCase{

    FootBallPlayerFactory footBallPlayer;
    FootBallPlayerInter footBallPlayerInter;


    @Before
    public void setUp() throws Exception {

            /*public FootBallPlayerFactory getFactory(String country)
    {
        if("South Africa".equalsIgnoreCase(country))
            return SAFootBallPlayerFactory.getSaFBPFInstance();
        else
            return ZimFootBallPlayerFactory.getZimFBPFInstance();
    }*/
    }

    @After
    public void tearDown() throws Exception {
        

    }

    @Test
    public void testGetName() throws Exception {
        AbstractFactory abstractFactory = AbstractFactory.getAbstractFactoryInstance();
        AbstractFactory abstractFactory1 = AbstractFactory.getAbstractFactoryInstance();
        footBallPlayer = abstractFactory.getFootBallPlayerFactory("South Africa");
        footBallPlayerInter = footBallPlayer.getFootBallPlayer("Kaizer Chiefs");

        assertEquals("Simphiwe Tshabalala",footBallPlayerInter.getName());

    }
}
