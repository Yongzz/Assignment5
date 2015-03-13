package za.ac.cput.templateMethodPattern;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by student on 2015/03/12.
 */
public class FileInputOutputTest extends TestCase{

    @Test
    public void testPerformOperation() throws Exception {
        FileInputOutput f1 = new ReadFromFile();
        FileInputOutput f2 = new WriteToFile();
        assertEquals("Opening file for reading... Reading from file.. Closing..",f1.performOperation());

    }
}
