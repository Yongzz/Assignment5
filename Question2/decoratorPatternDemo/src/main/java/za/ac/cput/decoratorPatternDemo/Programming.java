package za.ac.cput.decoratorPatternDemo;

/**
 * Created by student on 2015/03/11.
 */
public class Programming extends FriendDecorator{

    private AFriend afriend;
    Programming(AFriend friend)
    {
        afriend = friend;
    }

    @Override
    public String getDescription() {
        return afriend.getDescription()+"Always talk about developing cool apps";
    }

    public String developApps()
    {
        return "developing in java";
    }
}
