package za.ac.cput.factoryMethodTestDemo;

import junit.framework.TestCase;

/**
 * Created by student on 2015/03/13.
 */
public class EmployeeFactoryTest extends TestCase{

    @org.junit.Test
    public void testEmployee() throws Exception {
        EmployeeFactory employeeFactory = EmployeeFactory.getEmployeeFactoryInstance();

        Employee lecturer = employeeFactory.getEmployeeRole("Lecturer");
        Employee secretary = employeeFactory.getEmployeeRole("Secretary");

        assertEquals("Lecturer at CPUT",lecturer.role());

    }
}
