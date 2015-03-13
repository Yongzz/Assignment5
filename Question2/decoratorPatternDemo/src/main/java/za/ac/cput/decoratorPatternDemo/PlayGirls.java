package za.ac.cput.decoratorPatternDemo;

/**
 * Created by student on 2015/03/11.
 */
public class PlayGirls extends FriendDecorator {

    AFriend aFriend;
    PlayGirls(AFriend f)
    {
        aFriend = f;
    }
    @Override
    public String getDescription() {
        return aFriend.getDescription()+"Always talk about grls";
    }

    public String flirtingOnWhatsapp()
    {
        return "flirting on Whatsapp";
    }
}
