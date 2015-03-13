package za.ac.cput.compositePatternDemo;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by student on 2015/03/10.
 */
public class DogTest extends TestCase{

    @Test
    public void testName() throws Exception {
        Pet rott1 = new Rottweiler(3,"Donut");
        Pet rott2 = new Rottweiler(5,"Rover");
        Pet dog1 = new Dog(1,"Johnadan");
        dog1.add(rott1);
        dog1.add(rott2);


        assertEquals("Johnadan",dog1.getName());
    }
}
