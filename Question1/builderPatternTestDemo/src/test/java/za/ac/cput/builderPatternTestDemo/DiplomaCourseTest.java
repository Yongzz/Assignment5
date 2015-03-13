package za.ac.cput.builderPatternTestDemo;

import org.junit.Test;

/**
 * Created by student on 2015/03/13.
 */
public class DiplomaCourseTest {


    @Test
    public void testName() throws Exception {
        DiplomaCourseBuilder courser = new SecondYearDiplomaCourseBuilder();
        DiplomaCourseDirector diplomaCourseDirector = new DiplomaCourseDirector(courser);

        diplomaCourseDirector.constructDiplomaCourse();
        DiplomaCourse diplomaCourse = diplomaCourseDirector.getDiplomaCourse();
        System.out.println(diplomaCourse);


    }
}
