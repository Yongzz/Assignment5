package za.ac.cput.statePatternDemo;

/**
 * Created by student on 2015/03/13.
 */
public class OnBattryState implements AdjustPlanBrightness{
    @Override
    public String brightnessLevel() {
        return "50%";
    }
}
