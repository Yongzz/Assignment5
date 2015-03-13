package za.ac.cput.strategyPatternDemo;

/**
 * Created by student on 2015/03/13.
 */
public class PensionDiscount implements IDiscount {
    @Override
    public boolean eligibleForDiscounts(int age) {
        return (age > 64);
    }
}
