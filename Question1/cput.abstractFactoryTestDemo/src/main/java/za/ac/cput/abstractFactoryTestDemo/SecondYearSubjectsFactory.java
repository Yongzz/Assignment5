package za.ac.cput.abstractFactoryTestDemo;

/**
 * Created by student on 2015/03/13.
 */
public class SecondYearSubjectsFactory implements SubjectsFactory {
    @Override
    public Subject getSubjectName(String subjectCode) {
// Complete Implementation based on the Factory method Example
        if ("TP2".equalsIgnoreCase(subjectCode))
            return new SecondYearTP();
        else
            return new SecondYearDS();
    }
}
