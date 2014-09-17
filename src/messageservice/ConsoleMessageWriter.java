package messageservice;

/**
 *
 * @author jmiller
 */
public class ConsoleMessageWriter implements MessageWriter {

    @Override
    public void writeMessage(String message) {
        System.out.println("Here is the message that was provided:");
        System.out.println(message);
    }

}
