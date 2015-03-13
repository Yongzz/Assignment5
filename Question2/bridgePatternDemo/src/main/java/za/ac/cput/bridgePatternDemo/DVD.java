package za.ac.cput.bridgePatternDemo;

/**
 * Created by student on 2015/03/11.
 */
public class DVD implements ElectricAppliance {

    String name;

    DVD(String n)
    {
        name = n;    }
    @Override
    public String run() {
        return "Playing "+name;
    }
}
