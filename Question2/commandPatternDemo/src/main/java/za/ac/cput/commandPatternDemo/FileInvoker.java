package za.ac.cput.commandPatternDemo;

/**
 * Created by student on 2015/03/13.
 */
public class FileInvoker {
    ICommand command;

    FileInvoker(ICommand command)
    {
        this.command = command;
    }

    public  String invoke()
    {
        return command.execute();
    }
}
