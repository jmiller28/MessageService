package messageservice;

import java.util.Scanner;

/**
 *
 * @author jmiller
 */
public class KeyboardMessageReader implements MessageReader {

    @Override
    public String readMessage() {
        System.out.println("Please enter a message.");

        Scanner kb = new Scanner(System.in);
        return kb.nextLine();
    }

}
