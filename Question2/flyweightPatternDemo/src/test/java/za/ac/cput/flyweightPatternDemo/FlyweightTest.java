package za.ac.cput.flyweightPatternDemo;

import org.junit.Test;

/**
 * Created by student on 2015/03/10.
 */
public class FlyweightTest {
    @Test
    public void testName() throws Exception {
        FlyweightFactory flyweightFactory;
        flyweightFactory = FlyweightFactory.getInstance();

        for (int i=0;i<5;i++)
        {
            Flyweight areaFlyweight = flyweightFactory.getFlyweight("Area");
            areaFlyweight.calcCircle(i);

            Flyweight diameterFlyweight = flyweightFactory.getFlyweight("Diameter");
            diameterFlyweight.calcCircle(i);
        }

    }
}
