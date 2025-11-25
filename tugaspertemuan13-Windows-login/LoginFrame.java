import javax.swing.*;
import java.awt.*;

public class LoginFrame extends JFrame {
    private JTextField txtUsername;
    private JPasswordField txtPassword;
    private JButton btnLogin;
    private JButton btnCancel;

    public LoginFrame() {
        super("Form Login Modular");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2, 10, 10));

        JLabel lblUsername = new JLabel("Username:");
        JLabel lblPassword = new JLabel("Password:");
        
        txtUsername = new JTextField(20);
        txtPassword = new JPasswordField(20);
        
        btnLogin = new JButton("Login");
        btnCancel = new JButton("Cancel");

        btnLogin.addActionListener(new LoginListener(this));
        btnCancel.addActionListener(new CancelListener(this));

        panel.add(lblUsername);
        panel.add(txtUsername);
        panel.add(lblPassword);
        panel.add(txtPassword);
        panel.add(btnLogin);
        panel.add(btnCancel);

        getContentPane().add(BorderLayout.CENTER, panel);
        setSize(300, 150);
        setLocationRelativeTo(null); 
        setVisible(true);
    }

    public String getUsernameInput() {
        return txtUsername.getText();
    }

    public String getPasswordInput() {
        return new String(txtPassword.getPassword());
    }

    public void resetForm() {
        txtUsername.setText("");
        txtPassword.setText("");
        txtUsername.requestFocus();
    }
}