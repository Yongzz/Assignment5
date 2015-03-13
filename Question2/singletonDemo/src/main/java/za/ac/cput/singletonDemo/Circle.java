package za.ac.cput.singletonDemo;

/**
 * Created by student on 2015/03/03.
 */
public class Circle {

    private static Circle circle = null;
    private double radius;
    private double PI;

    private Circle()
    {
        PI = 3.14;
    }

    public static Circle getInstance()
    {
        if (circle == null)
        {
            circle = new Circle();
        }
        return circle;
    }

    public double calcDiameter(double r)
    {
        return radius * 2;
    }

}
