package za.ac.cput.adapterPatternDemo;

/**
 * Created by student on 2015/03/09.
 */
public class XhosaGreeting implements MultiLingoGreeter {

    XhosaGreeting()
    {

    }
    @Override
    public String getXhosaGreeting() {
        return "Molo";
    }

    @Override
    public String getZuluGreeting() {
        return null;
    }

}
