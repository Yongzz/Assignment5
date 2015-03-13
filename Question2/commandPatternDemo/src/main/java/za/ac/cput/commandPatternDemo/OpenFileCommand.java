package za.ac.cput.commandPatternDemo;

/**
 * Created by student on 2015/03/13.
 */
public class OpenFileCommand implements ICommand {

    private OpenFile openFile;

    OpenFileCommand(OpenFile openFile)
    {
        this.openFile = openFile;
    }


    @Override
    public String execute() {
        return openFile.open();
    }
}
