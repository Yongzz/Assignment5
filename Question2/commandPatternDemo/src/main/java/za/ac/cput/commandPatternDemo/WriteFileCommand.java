package za.ac.cput.commandPatternDemo;

/**
 * Created by student on 2015/03/13.
 */
public class WriteFileCommand implements ICommand {

    WriteFile writeFile;
    WriteFileCommand(WriteFile writeFile)
    {
        this.writeFile = writeFile;
    }

    @Override
    public String execute() {
        return writeFile.write();
    }
}
