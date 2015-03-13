package za.ac.cput.mediatorPatternDemo;

/**
 * Created by student on 2015/03/13.
 */
public class ChatRoomMemberImpl extends ChatRoomMember{


    public ChatRoomMemberImpl(ChatRoomMediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void broadCast(String msg) {
        System.out.println( this.name+" :Your message -->"+msg);
        mediator.broadCastMsg(msg,this);

    }

    @Override
    public void receive(String msg) {
        System.out.println( this.name+" :Received Message ["+msg+"]");
    }
}
