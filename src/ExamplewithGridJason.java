import javax.swing.*;
import java.awt.*;

public class ExamplewithGridJason {
    private JPanel panel;
    private JFrame frame;
    private JLabel label;
    private JLabel label2;
    private JButton button;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JPanel panel2;

    public static void main (String[] args){
        ExamplewithGridJason ex = new ExamplewithGridJason();
    }

    public ExamplewithGridJason(){
        frame = new JFrame("border");
        panel = new JPanel(new BorderLayout());
        panel2 = new JPanel(new GridLayout(2,3));
        button = new JButton("Button 1");
        button2 = new JButton("Button 2");
        button3 = new JButton("Button 3");
        button4 = new JButton("Button 4");
        button5 = new JButton("Button 5");
        label = new JLabel("Label 1!");
        label2 = new JLabel("Label 2!");

        panel.add(button, BorderLayout.NORTH);
        panel.add(panel2);
        panel2.add(button2, BorderLayout.WEST);
        panel2.add(label, BorderLayout.CENTER);
        panel2.add(button4, BorderLayout.EAST);
        panel2.add(label2, BorderLayout.WEST);
        panel2.add(button5, BorderLayout.CENTER);
        panel.add(button3, BorderLayout.SOUTH);
        frame.add(panel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.setVisible(true);

    }

}
