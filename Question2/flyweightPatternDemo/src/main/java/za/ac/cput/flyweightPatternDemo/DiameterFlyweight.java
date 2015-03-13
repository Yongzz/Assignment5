package za.ac.cput.flyweightPatternDemo;

/**
 * Created by student on 2015/03/10.
 */
public class DiameterFlyweight implements Flyweight {
    private String method;

    DiameterFlyweight()
    {
        method = "Diameter";
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void calcCircle(double radius) {
        System.out.println(method+" is : "+(radius+radius));
    }
}
