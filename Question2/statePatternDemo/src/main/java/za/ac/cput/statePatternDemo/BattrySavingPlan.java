package za.ac.cput.statePatternDemo;

/**
 * Created by student on 2015/03/13.
 */
public class BattrySavingPlan implements AdjustPlanBrightness {


    AdjustPlanBrightness apb;

    public BattrySavingPlan(AdjustPlanBrightness apb) {
        this.apb = apb;
    }

    public void setApb(AdjustPlanBrightness apb) {
        this.apb = apb;
    }


    @Override
    public String brightnessLevel() {
        return apb.brightnessLevel();
    }
}
