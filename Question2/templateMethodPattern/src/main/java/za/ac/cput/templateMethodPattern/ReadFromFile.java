package za.ac.cput.templateMethodPattern;

/**
 * Created by student on 2015/03/12.
 */
public class ReadFromFile extends FileInputOutput{

    @Override
    public String open() {
        return "Opening file for reading... ";
    }

    @Override
    public String operation() {
        return "Reading from file.. ";
    }
}
