package za.ac.cput.abstractFactoryTestDemo;

import org.junit.Assert;

/**
 * Created by student on 2015/03/13.
 */
public class abstractFactoryTest {

    @org.junit.Test
    public void testName() throws Exception {
        SubjectsFactory subjectFactry3 = new ThirdYearSubjectsFactory();
        SubjectsFactory subjectFactry2 = new SecondYearSubjectsFactory();
        SecondYearDS ds;
         ds = (SecondYearDS)subjectFactry2.getSubjectName("DS2");

        Assert.assertEquals(" Development Software 2",ds.getSubjectName());
    }
}
