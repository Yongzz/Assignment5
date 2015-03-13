package za.ac.cput.templateMethodPattern;

/**
 * Created by student on 2015/03/12.
 */
public class WriteToFile extends FileInputOutput{

    @Override
    public String open() {
        return "Opening file for writing... ";
    }

    @Override
    public String operation() {
        return "Writing to a file";
    }
}
