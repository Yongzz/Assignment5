package za.ac.cput.commandPatternDemo;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by student on 2015/03/13.
 */
public class ICommandTest extends TestCase{


    @Test
    public void testInvoke() throws Exception {
        OpenFile openFile = new OpenFile();
        OpenFileCommand openFileCommand = new OpenFileCommand(openFile);

        WriteFile write = new WriteFile();
        WriteFileCommand writeFileCommand = new WriteFileCommand(write);
        CloseFile close = new CloseFile();
        CloseFileCommand closeFileCommand = new CloseFileCommand(close);

        FileInvoker file = new FileInvoker(openFileCommand);
        assertEquals("File opening...",file.invoke());

    }
}
