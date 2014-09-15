package messageservice;

/**
 *
 * @author jmiller
 */
public class MessageService {
    
    private Acquirer acquirer;
    private Provider provider;
    
    public MessageService(Acquirer acquirer, Provider provider) {
        this.acquirer = acquirer;
        this.provider = provider;
    }
    
    public void Message() {
        String message = acquirer.acquireMessage();
        provider.provideMessage(message);
    }
}
