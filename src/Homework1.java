import javax.swing.*;
import java.awt.*;

public class Homework1 {

    //Step 1: declare variables
    private JFrame frame;
    private JPanel panel;
    private JButton button;
    private JButton button2;
    private JLabel label;
    private JLabel label2;
    private JTextField textfield;


    public static void main(String[] args) {
        Homework1 p = new Homework1();
    }

    public Homework1(){
        //Step 2: construct variables
        frame = new JFrame("Homework 1");
        panel = new JPanel(new GridLayout(2,2));
        button = new JButton("Button 1");
        button2 = new JButton("Button 2");
        label = new JLabel("Label 1!");
        label2 = new JLabel("Label 2!");
        textfield = new JTextField();

        //Step 3: organize the layout
//        panel.add(button, BorderLayout.NORTH);
//        panel.add(label, BorderLayout.CENTER);
//        panel.add(label2, BorderLayout.SOUTH);

        panel.add(label);
        panel.add(button);
        panel.add(button2);
        panel.add(label2);
        frame.add(panel);

        //Step 4: make frame appear
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        //frame.pack();
        frame.setVisible(true);
    }

}