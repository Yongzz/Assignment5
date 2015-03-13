package za.ac.cput.proxyPatternDemo;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by student on 2015/03/10.
 */
public class FolderProxyTest extends TestCase{
    @Test
    public void testDeleteFile() throws Exception {
        Operator o = new Operator("yongz","yongz");
        FolderProxy f = new FolderProxy(o);

        assertEquals("File Deleted",f.deleteFile());


    }
}
