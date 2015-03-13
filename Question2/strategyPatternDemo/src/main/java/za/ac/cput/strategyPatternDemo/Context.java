package za.ac.cput.strategyPatternDemo;

/**
 * Created by student on 2015/03/13.
 */
public class Context {



    private int age;
    private IDiscount discount;

    Context(int age, IDiscount discount)
    {
        this.age = age;
        this.discount = discount;
    }

    public void setDiscount(IDiscount discount) {
        this.discount = discount;
    }

    public int getAge() {
        return age;
    }

    public boolean getResults()
    {
        return discount.eligibleForDiscounts(age);
    }

}
