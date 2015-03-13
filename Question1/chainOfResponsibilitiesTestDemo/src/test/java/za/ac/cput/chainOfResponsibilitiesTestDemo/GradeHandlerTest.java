package za.ac.cput.chainOfResponsibilitiesTestDemo;

import org.junit.Test;

/**
 * Created by student on 2015/03/13.
 */
public class GradeHandlerTest {
    @Test
    public void testName() throws Exception {
        GradeHandler chain = setUpChain();

        chain.handleRequest(79);
        chain.handleRequest(71);
        chain.handleRequest(66);
        chain.handleRequest(61);
    }




    public static GradeHandler setUpChain()
    {

        GradeHandler gradeAHandler = new GradeAHandler();
        GradeHandler gradeBHandler = new GradeBHandler();
        GradeHandler gradeCHandler = new GradeCHandler();
        GradeHandler gradeDHandler = new GradeDHandler();


        gradeAHandler.setSuccessor(gradeBHandler);
        gradeBHandler.setSuccessor(gradeCHandler);
        gradeCHandler.setSuccessor(gradeDHandler);


        return gradeAHandler;
    }
}
