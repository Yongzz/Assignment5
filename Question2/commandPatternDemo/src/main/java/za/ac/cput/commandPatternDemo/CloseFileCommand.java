package za.ac.cput.commandPatternDemo;

/**
 * Created by student on 2015/03/13.
 */
public class CloseFileCommand implements ICommand {
    private CloseFile closeFile;
    CloseFileCommand(CloseFile closeFile)
    {
        this.closeFile = closeFile;
    }


    @Override
    public String execute() {
        return closeFile.close();
    }
}
