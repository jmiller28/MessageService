package messageservice;

import java.util.Scanner;

/**
 *
 * @author jmiller
 */
public class KeyboardAcquirer implements Acquirer {

    @Override
    public String acquireMessage() {
        System.out.println("Please enter a message.");

        Scanner kb = new Scanner(System.in);
        return kb.nextLine();
    }

}
