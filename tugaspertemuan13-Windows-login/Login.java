import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login {
    String correctUsername = "wackyboo";
    String correctPassword = "maircelius";
    
    
    JFrame frame;
    JTextField txtUsername;
    JPasswordField txtPassword; 
    JButton btnLogin;
    JButton btnCancel;

    public static void main(String[] args) {
        Login gui = new Login();
        gui.go();
    }

    public void go() {
        frame = new JFrame("Login Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2, 10, 10)); 

        JLabel lblUsername = new JLabel("Username:");
        JLabel lblPassword = new JLabel("Password:");
        
        txtUsername = new JTextField(20);
        txtPassword = new JPasswordField(20);
        
        btnLogin = new JButton("Login");
        btnLogin.addActionListener(new LoginListener());
        
        btnCancel = new JButton("Cancel");
        btnCancel.addActionListener(new CancelListener());

        panel.add(lblUsername);
        panel.add(txtUsername);
        panel.add(lblPassword);
        panel.add(txtPassword);
        panel.add(btnLogin);
        panel.add(btnCancel);

        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.setSize(300, 150);
        frame.setLocationRelativeTo(null); 
        frame.setVisible(true);
    }

    public class LoginListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            String inputUser = txtUsername.getText();
            String inputPass = new String(txtPassword.getPassword()); 
            
            if (inputUser.equals(correctUsername) && inputPass.equals(correctPassword)) {
                JOptionPane.showMessageDialog(frame, "Login Granted! Selamat Datang.");
            } else {
                JOptionPane.showMessageDialog(frame, "Login Denied! Username atau Password salah.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public class CancelListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            txtUsername.setText(""); 
            txtPassword.setText("");
            txtUsername.requestFocus(); 
        }
    }
}