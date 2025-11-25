import java.awt.event.*;

public class CancelListener implements ActionListener {

    private LoginFrame frame;

    public CancelListener(LoginFrame frame) {
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        frame.resetForm();
    }
}