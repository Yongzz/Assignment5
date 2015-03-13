package za.ac.cput.builderPatternDemo;

/**
 * Created by student on 2015/03/07.
 */
public interface SandwichBuilder {
    public void buildBread();
    public void buildButter();
    public void buildTopping();
    public Sandwich buildSandwich();
}
