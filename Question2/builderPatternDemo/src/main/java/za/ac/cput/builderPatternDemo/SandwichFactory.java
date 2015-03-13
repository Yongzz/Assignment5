package za.ac.cput.builderPatternDemo;

/**
 * Created by student on 2015/03/07.
 */
public class SandwichFactory {
    private static SandwichFactory ourInstance = null;

    public static SandwichFactory getInstance() {
        if (ourInstance == null)
            return new SandwichFactory();
        else
            return ourInstance;
    }

    private SandwichFactory() {
    }

    public SandwichBuilder getSandwitchType(String flavour) {
        if ("Apple".equalsIgnoreCase(flavour)) {
            return new ApplePeanutButterBuilder();
        } else {
            return new AvocadoLettuceTomatoBuilder();
        }
    }

}
