package messageservice;

/**
 *
 * @author jmiller
 */
public class Startup {

    public static void main(String[] args) {
        //Acquirer acquirer = new KeyboardAcquirer();
        Acquirer acquirer = new ArrayAcquirer();

        //Provider provider = new ConsoleProvider();
        Provider provider = new GuiProvider();

        MessageService messageService = new MessageService(acquirer, provider);
        messageService.Message();
    }
}
