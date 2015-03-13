package za.ac.cput.flyweightPatternDemo;

/**
 * Created by student on 2015/03/10.
 */
public class AreaFlyweight implements Flyweight {
    private String method;

    AreaFlyweight()
    {
        method = "Area";
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void calcCircle(double radius) {
        System.out.println(method+" is : "+(3.14 *(radius*radius)));
    }
}
