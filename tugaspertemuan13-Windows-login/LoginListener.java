import javax.swing.*;
import java.awt.event.*;

public class LoginListener implements ActionListener {

    private LoginFrame frame;
    
    private final String VALID_USER = "wackyboo";
    private final String VALID_PASS = "maircelius";

    public LoginListener(LoginFrame frame) {
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String user = frame.getUsernameInput();
        String pass = frame.getPasswordInput();

        if (user.equals(VALID_USER) && pass.equals(VALID_PASS)) {
            JOptionPane.showMessageDialog(frame, 
                "Login Granted! Selamat datang, " + user);
        } else {
            JOptionPane.showMessageDialog(frame, 
                "Login Denied! Username atau Password salah.", 
                "Peringatan", JOptionPane.ERROR_MESSAGE);
        }
    }
}