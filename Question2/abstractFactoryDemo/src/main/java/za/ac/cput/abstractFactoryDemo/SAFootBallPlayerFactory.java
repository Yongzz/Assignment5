package za.ac.cput.abstractFactoryDemo;

/**
 * Created by student on 2015/03/05.
 */
public class SAFootBallPlayerFactory  implements FootBallPlayerFactory{

    private static SAFootBallPlayerFactory saFBPFactory = null;

    private SAFootBallPlayerFactory(){}

    public static SAFootBallPlayerFactory getSaFBPFInstance()
    {
        if (saFBPFactory == null)
        {
            saFBPFactory = new SAFootBallPlayerFactory();
        }
        return saFBPFactory;
    }

    @Override
    public FootBallPlayerInter getFootBallPlayer(String team) {
        if("Kaizer Chiefs".equalsIgnoreCase(team))
            return new KaizerChiefsFootBallPlayer();
        else
            return new OrlandoPiratesFootBallPlayer();
    }
}
