package za.ac.cput.builderPatternDemo;

/**
 * Created by student on 2015/03/07.
 */
public class ApplePeanutButterBuilder implements SandwichBuilder{
    private Sandwich sandwich;

    ApplePeanutButterBuilder()
    {
        sandwich = new Sandwich();
    }
    @Override
    public void buildBread() {
        sandwich.setBread("Sliced Bread");
    }

    @Override
    public void buildButter() {
        sandwich.setButter("Peanut Butter");
    }

    @Override
    public void buildTopping() {
        sandwich.setTopping("Apple");
    }

    @Override
    public Sandwich buildSandwich() {
        return sandwich;
    }
}
