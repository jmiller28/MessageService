package messageservice;

/**
 *
 * @author jmiller
 */
public class ConsoleProvider implements Provider {

    @Override
    public void provideMessage(String message) {
        System.out.println("Here is the message that was provided:");
        System.out.println(message);
    }

}
