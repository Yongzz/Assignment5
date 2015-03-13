package za.ac.cput.strategyPatternDemo;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by student on 2015/03/13.
 */
public class IDiscountTest extends TestCase{



    @Test
    public void testName() throws Exception {

        IDiscount discount = new KidDiscount();
        Context context = new Context(11,discount);

        if(context.getResults())
            System.out.println("You are Eligible for Kid discount\n");
        else
            System.out.println("Sorry you not Eligible for kid Discount\n");


        IDiscount discount1 = new PensionDiscount();
        Context context1 = new Context(65,discount1);

        if(context1.getResults())
            System.out.println("You are Eligible for Pension Discount\n");
        else
            System.out.println("You not Eligible for Pension Discount\n");
        assertTrue(context.getResults());


    }
}
