package za.ac.cput.adapterPatternDemo;

/**
 * Created by student on 2015/03/09.
 */
public class MultiLingoGreetingApp implements Greeting{

    LanguageTranslationClassAdapter LTCA;

    @Override
    public String greetingMsg(String lingo) {
        if ("English".equalsIgnoreCase(lingo))
            return "Hello";
        else if(lingo.equalsIgnoreCase("Xhosa") || lingo.equalsIgnoreCase("Zulu")) {
            LTCA = new LanguageTranslationClassAdapter(lingo);
            return LTCA.greetingMsg(lingo);
        }
        else
            return "I can't in that language";
    }
}
