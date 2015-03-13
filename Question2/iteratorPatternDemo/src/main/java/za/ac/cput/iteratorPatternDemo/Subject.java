package za.ac.cput.iteratorPatternDemo;

/**
 * Created by student on 2015/03/12.
 */
public class Subject {
    private String name;
    private String code;

    Subject(String name, String code)
    {
        this.name =name;
        this.code = code;
    }

    public String toString()
    {
        return code+" "+name;
    }
}
