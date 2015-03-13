package za.ac.cput.abstractFactoryDemo;

/**
 * Created by student on 2015/03/07.
 */
public class AbstractFactory {

    public static AbstractFactory abstractFactory = null;

    private AbstractFactory()
    {
    }

    public static AbstractFactory getAbstractFactoryInstance()
    {
        if (abstractFactory == null)
        {
            return new AbstractFactory();
        }
        return abstractFactory;
    }

    public FootBallPlayerFactory getFootBallPlayerFactory(String country)
    {
        if ("South Africa".equalsIgnoreCase(country))
            return SAFootBallPlayerFactory.getSaFBPFInstance();
        else
            return ZimFootBallPlayerFactory.getZimFBPFInstance();
    }
}
