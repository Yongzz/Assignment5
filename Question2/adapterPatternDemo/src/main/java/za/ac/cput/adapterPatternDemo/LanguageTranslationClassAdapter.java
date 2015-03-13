package za.ac.cput.adapterPatternDemo;

/**
 * Created by student on 2015/03/09.
 */
public class LanguageTranslationClassAdapter implements Greeting{

    private MultiLingoGreeter multiLingoGreeter;

    LanguageTranslationClassAdapter(String lingo)
    {
        if ("Xhosa".equalsIgnoreCase(lingo))
            multiLingoGreeter = new XhosaGreeting();
        else
            multiLingoGreeter = new ZuluGreeting();
    }

    @Override
    public String greetingMsg(String lingo) {
        if ("Xhosa".equalsIgnoreCase(lingo))
            return multiLingoGreeter.getXhosaGreeting();
        else
            return multiLingoGreeter.getZuluGreeting();
    }
}
