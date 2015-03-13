package za.ac.cput.prototypePatternDemo;

/**
 * Created by student on 2015/03/08.
 */
public class Album implements PrototypeObject {

    private String name;

    public String getName() {
        return name;
    }

    Album(String name)
    {
        this.name = name;
    }

    @Override
    public PrototypeObject doClone() {
        return new Album(name);
    }

    public String toString()
    {
        return ("Album name : " + name);
    }
}
