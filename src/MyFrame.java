import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JButton button = new JButton();
    JLabel label;

    public MyFrame() {

        ImageIcon icon = new ImageIcon("images//point.png");

        label = new JLabel();
        label.setText("Hello");
        label.setBounds(150, 250, 150, 150);
        label.setVisible(true);

        button.setBounds(100, 100, 250, 100);
        button.addActionListener(e -> System.out.println("hit"));
        button.setText("I'm a button");
        button.setFocusable(false);
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans", Font.BOLD, 25));
        button.setIconTextGap(-2);
        button.setForeground(Color.cyan);
        // button.setBackground(Color.blue);
        button.setBorder(BorderFactory.createEtchedBorder());

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);
        this.add(button);
        this.add(label);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource()==button) {
            // System.out.println("hit");
            label.setVisible(true);
        }
    }
}
