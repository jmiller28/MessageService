package messageservice;

import javax.swing.JOptionPane;

/**
 *
 * @author jmiller
 */
public class GuiProvider implements Provider {

    @Override
    public void provideMessage(String message) {
        JOptionPane.showMessageDialog(null, message);
    }

}
