package za.ac.cput.mediatorPatternDemo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 2015/03/13.
 */
public class ChatRoomMediatorImpl implements ChatRoomMediator{

    List<ChatRoomMember> member;

    public ChatRoomMediatorImpl() {
        this.member = new ArrayList();
    }

    @Override
    public void broadCastMsg(String msg, ChatRoomMember member) {
        for (ChatRoomMember m: this.member)
            if (m != member)
                m.receive(msg);
    }

    @Override
    public void addMember(ChatRoomMember member) {
        this.member.add(member);
    }
}
