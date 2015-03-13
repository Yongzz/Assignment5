package za.ac.cput.builderPatternDemo;

/**
 * Created by student on 2015/03/07.
 */
public class AvocadoLettuceTomatoBuilder implements SandwichBuilder {
    private Sandwich sandwich;

    AvocadoLettuceTomatoBuilder()
    {
        sandwich = new Sandwich();
    }
    @Override
    public void buildBread() {
        sandwich.setBread("Toasted whole grain bread");
    }

    @Override
    public void buildButter() {
        sandwich.setButter("Lettuce");
    }

    @Override
    public void buildTopping() {
        sandwich.setTopping("Sliced avocado + Sliced fresh tomato + Kosher salt + Mayonnaise");
    }

    @Override
    public Sandwich buildSandwich() {

        return sandwich;
    }
}
