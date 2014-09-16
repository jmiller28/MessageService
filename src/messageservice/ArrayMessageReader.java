package messageservice;

import java.util.Random;

/**
 *
 * @author jmiller
 */
public class ArrayMessageReader implements MessageReader {

    @Override
    public String readMessage() {
        String[] messages = new String[10];

        for (int i = 0; i < messages.length; i++) {
            messages[i] = "This is message number " + i + ".";
        }

        Random randomNumber = new Random();
        int index = randomNumber.nextInt(10);

        return messages[index];
    }

}
