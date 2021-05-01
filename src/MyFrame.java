import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    public MyFrame() {

        this.setTitle("My first JFrame");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(420, 420);
        this.setVisible(true);

        ImageIcon image = new ImageIcon("logo.jpg");
        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(new Color(0x123456));
    }
}
