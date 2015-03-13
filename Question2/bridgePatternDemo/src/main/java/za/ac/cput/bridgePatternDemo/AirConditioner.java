package za.ac.cput.bridgePatternDemo;

/**
 * Created by student on 2015/03/11.
 */
public class AirConditioner implements ElectricAppliance{

    String name;
    AirConditioner(String name){this.name = name;}

    @Override
    public String  run() {
        return "Running "+name;
    }
}
