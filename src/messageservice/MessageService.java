package messageservice;

/**
 *
 * @author jmiller
 */
public class MessageService {
    
    private MessageReader messageInput;
    private MessageWriter messageOutput;
    
    public MessageService (MessageReader input, MessageWriter output) {
        this.messageInput = input;
        this.messageOutput = output;
    }
    
    public void Message() {
        String message = messageInput.readMessage();
        messageOutput.writeMessage(message);
    }
}
