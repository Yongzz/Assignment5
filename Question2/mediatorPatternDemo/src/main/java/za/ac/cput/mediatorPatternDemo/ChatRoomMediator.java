package za.ac.cput.mediatorPatternDemo;

/**
 * Created by student on 2015/03/13.
 */
public interface ChatRoomMediator {
    public void broadCastMsg(String msg,ChatRoomMember member);
    void addMember(ChatRoomMember member);
}
