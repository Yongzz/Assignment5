package za.ac.cput.mediatorPatternDemo;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by student on 2015/03/13.
 */
public class ChatRoomMediatorTest extends TestCase{

    @Test
    public void testName() throws Exception {
        ChatRoomMediator chat = new ChatRoomMediatorImpl();
        ChatRoomMember member1 = new ChatRoomMemberImpl(chat,"Xoliseka");
        ChatRoomMember member2 = new ChatRoomMemberImpl(chat,"Xoliseka");
        ChatRoomMember member3 = new ChatRoomMemberImpl(chat,"Xoliseka");
        chat.addMember(member1);
        chat.addMember(member2);
        chat.addMember(member3);
        member2.broadCast("Meeting tomorrow, Don't forget");

        assertEquals(member2,member2);
    }
}
