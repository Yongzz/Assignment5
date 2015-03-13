package za.ac.cput.abstractFactoryTestDemo;

/**
 * Created by student on 2015/03/13.
 */
public class ThirdYearSubjectsFactory
        implements SubjectsFactory{
    @Override
    public Subject getSubjectName(String subjectCode) {
// Complete Implementation based on the Factory method Example
        if ("DS3".equalsIgnoreCase(subjectCode))
        return new ThirdYearDS();
        else
            return new ThirdYearTP();
    }
}
