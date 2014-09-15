package messageservice;

import java.util.Random;

/**
 *
 * @author jmiller
 */
public class ArrayAcquirer implements Acquirer {

    @Override
    public String acquireMessage() {
        String[] messages = new String[10];

        for (int i = 0; i < messages.length; i++) {
            messages[i] = "This is message number " + i + ".";
        }

        Random randomNumber = new Random();
        int index = randomNumber.nextInt(10);

        return messages[index];
    }

}
