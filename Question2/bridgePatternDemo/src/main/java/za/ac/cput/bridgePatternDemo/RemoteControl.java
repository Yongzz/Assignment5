package za.ac.cput.bridgePatternDemo;

/**
 * Created by student on 2015/03/11.
 */
public class RemoteControl extends Switch{



    RemoteControl(ElectricAppliance e){
        this.homeAppliance = e;
    }
    @Override
    public String on() {
        return homeAppliance.run();
    }
}
