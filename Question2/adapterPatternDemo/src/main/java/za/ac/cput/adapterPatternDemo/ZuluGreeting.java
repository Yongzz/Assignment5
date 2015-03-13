package za.ac.cput.adapterPatternDemo;

/**
 * Created by student on 2015/03/09.
 */
public class ZuluGreeting implements MultiLingoGreeter {
    @Override
    public String getXhosaGreeting() {
        return null;
    }

    @Override
    public String getZuluGreeting() {
        return "Sawubona";
    }
}
