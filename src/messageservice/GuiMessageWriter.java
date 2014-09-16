package messageservice;

import javax.swing.JOptionPane;

/**
 *
 * @author jmiller
 */
public class GuiMessageWriter implements MessageWriter {

    @Override
    public void writeMessage(String message) {
        JOptionPane.showMessageDialog(null, message);
    }

}
