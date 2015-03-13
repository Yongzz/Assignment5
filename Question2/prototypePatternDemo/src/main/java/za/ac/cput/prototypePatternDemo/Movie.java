package za.ac.cput.prototypePatternDemo;

/**
 * Created by student on 2015/03/08.
 */
public class Movie implements  PrototypeObject {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public PrototypeObject doClone() {
        return new Movie();
    }

    public String toString()
    {
        return ("Movies title : " + name);
    }
}
