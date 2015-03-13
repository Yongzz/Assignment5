package za.ac.cput.proxyPatternDemo;

/**
 * Created by student on 2015/03/10.
 */
public class Folder implements MyFolder{

    @Override
    public String deleteFile() {
        return "File Deleted";
    }
}
