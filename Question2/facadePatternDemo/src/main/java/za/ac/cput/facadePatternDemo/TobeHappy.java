package za.ac.cput.facadePatternDemo;

/**
 * Created by student on 2015/03/10.
 */
public class TobeHappy {
    private Person employee;
    private Person student;
    private Person family;

    TobeHappy() {
        employee = new Work();
        student = new School();
        family = new Family();
    }

    public String beHAppyAtSchool() {
        return student.beHappy();
    }

    public String beHappyAtWork() {
        return employee.beHappy();
    }

    public String beHappyAtHome() {
        return family.beHappy();
    }
}
