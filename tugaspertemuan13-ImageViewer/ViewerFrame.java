import javax.swing.*;
import java.awt.*;

public class ViewerFrame extends JFrame {
    private JLabel imageLabel;
    private JButton btnOpen;

    public ViewerFrame() {
        setTitle("Aplikasi Image Viewer Modular");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 500);
        setLayout(new BorderLayout());

        imageLabel = new JLabel("Silakan pilih gambar...", SwingConstants.CENTER);
        JScrollPane scrollPane = new JScrollPane(imageLabel);

        btnOpen = new JButton("Buka Gambar");
        
        btnOpen.addActionListener(new OpenImageListener(this));

        add(scrollPane, BorderLayout.CENTER);
        add(btnOpen, BorderLayout.SOUTH);

        setLocationRelativeTo(null); 
        setVisible(true);
    }

    public JLabel getImageLabel() {
        return imageLabel;
    }
}