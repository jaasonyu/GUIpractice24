import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class ClassmateChallenge {
    private JFrame frame;
    private JPanel panel;
    private JButton button1;
    private JButton button;
    private JLabel label;
    private JTextField text;
    private JTextField text1;
    private JPanel panel1;
    private JPanel panel2;

    public static void main(String[] args) {
        ClassmateChallenge classmate = new ClassmateChallenge();
    }

    public ClassmateChallenge() {
        frame = new JFrame();
        button1 = new JButton("Button 1");
        button = new JButton("Button");
        label = new JLabel("Label");
        text = new JTextField("Search...");
        text1 = new JTextField("Results");
        panel = new JPanel(new BorderLayout());
        panel1 = new JPanel(new GridLayout(3, 1));

        panel.add(text, BorderLayout.NORTH);
        panel.add(panel1, BorderLayout.EAST);
        panel1.add(button1, BorderLayout.NORTH);
        panel1.add(label, BorderLayout.CENTER);
        panel1.add(button, BorderLayout.SOUTH);
        panel.add(text1, BorderLayout.CENTER);
        frame.add(panel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand() == "Button1") {
            String Tex = text.getText();
            text1.setText(Tex);
        }
    }
}