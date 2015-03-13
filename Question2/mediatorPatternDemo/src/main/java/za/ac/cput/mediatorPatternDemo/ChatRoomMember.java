package za.ac.cput.mediatorPatternDemo;

/**
 * Created by student on 2015/03/13.
 */
public abstract class ChatRoomMember {
    protected ChatRoomMediator mediator;
    protected String name;

    public ChatRoomMember(ChatRoomMediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public abstract void broadCast(String msg);
    public abstract void receive(String msg);
}
