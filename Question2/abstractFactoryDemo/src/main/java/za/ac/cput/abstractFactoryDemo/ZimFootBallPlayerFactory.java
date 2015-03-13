package za.ac.cput.abstractFactoryDemo;

/**
 * Created by student on 2015/03/05.
 */
public class ZimFootBallPlayerFactory implements  FootBallPlayerFactory{

    private static ZimFootBallPlayerFactory ZimFBPFactory = null;

    private ZimFootBallPlayerFactory(){}

    public static ZimFootBallPlayerFactory getZimFBPFInstance()
    {
        if (ZimFBPFactory == null)
        {
            ZimFBPFactory = new ZimFootBallPlayerFactory();
        }
        return ZimFBPFactory;
    }
    @Override
    public FootBallPlayerInter getFootBallPlayer(String team) {
        if("Bantu Rovers".equalsIgnoreCase(team))
            return new BantuRoversFootBallPlayer();

            return new BlackRhinosFootBallPlayer();
    }



}
