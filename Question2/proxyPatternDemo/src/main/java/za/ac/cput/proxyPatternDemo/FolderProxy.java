package za.ac.cput.proxyPatternDemo;

/**
 * Created by student on 2015/03/10.
 */
public class FolderProxy implements MyFolder {
    private Folder folder;
    private Operator operator;
    FolderProxy(Operator o){
        operator =o;
    }
    @Override
    public String deleteFile() {
        if (operator.getUsername().equalsIgnoreCase("yongz") && operator.getPassword().equalsIgnoreCase("yongz")) {
            folder = new Folder();
            return folder.deleteFile();
        }else
            return "You don't have right to perform operation";
    }
}
