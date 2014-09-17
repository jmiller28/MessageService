package messageservice;

/**
 *
 * @author jmiller
 */
public class Startup {

    public static void main(String[] args) {
        //MessageReader input = new KeyboardMessageReader();
        MessageReader input = new ArrayMessageReader();

        //MessgaeWriter output = new ConsoleMessageWriter();
        MessageWriter output = new GuiMessageWriter();

        MessageService messageService = new MessageService(input, output);
        messageService.processMessage();
    }
}
