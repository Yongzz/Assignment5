package za.ac.cput.templateMethodPattern;

/**
 * Created by student on 2015/03/12.
 */
public abstract class FileInputOutput {

    public final String performOperation()
    {
        return open()+ operation() +close();

    }

    public abstract String open();
    public abstract String operation();
    public  String close()
    {
            return "Closing..";
    }

}
