package za.ac.cput.builderPatternTestDemo;

/**
 * Created by student on 2015/03/13.
 */
public interface DiplomaCourseBuilder {
    public void buildTechnicalPrograming();
    public void buildInformationSystems();
    public void buildInternetPrograming();
    public void buildDevelopmentSoftware();
    public DiplomaCourse getDiplomaCourse();
}
