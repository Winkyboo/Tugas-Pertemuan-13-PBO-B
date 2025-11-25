import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.*;
import java.io.File;

public class OpenImageListener implements ActionListener {
    private ViewerFrame parentFrame;
    public OpenImageListener(ViewerFrame frame) {
        this.parentFrame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter(
                "Gambar (JPG, PNG, GIF)", "jpg", "jpeg", "png", "gif");
        fileChooser.setFileFilter(filter);

        int result = fileChooser.showOpenDialog(parentFrame);

        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            String path = selectedFile.getAbsolutePath();

            ImageIcon icon = new ImageIcon(path);
            
            Image img = icon.getImage();
            int targetWidth = parentFrame.getWidth() - 50; 
            Image scaledImg = img.getScaledInstance(targetWidth, -1, Image.SCALE_SMOOTH);
            ImageIcon scaledIcon = new ImageIcon(scaledImg);

            parentFrame.getImageLabel().setText(""); 
            parentFrame.getImageLabel().setIcon(scaledIcon);
        }
    }
}