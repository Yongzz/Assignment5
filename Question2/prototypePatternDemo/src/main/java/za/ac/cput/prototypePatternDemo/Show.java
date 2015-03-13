package za.ac.cput.prototypePatternDemo;

/**
 * Created by student on 2015/03/08.
 */
public class Show implements PrototypeObject {
    private String name;

    public String getName() {
        return name;
    }


    Show(String name)
    {
        this.name = name;
    }
    @Override
    public PrototypeObject doClone() {
        return new Show(name);
    }

    public String toString()
    {
        return ("Show name: " + name);
    }
}
