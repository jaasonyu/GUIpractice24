import javax.swing.*;
import java.awt.*;

public class Homework2 {

    //Step 1: declare variables
    private JFrame frame;
    private JPanel panel;
    private JButton button;
    private JLabel label;
    private JTextField textfield;
    private JTextField textfield2;


    public static void main(String[] args) {
        Homework2 p = new Homework2();
    }

    public Homework2(){
        //Step 2: construct variables
        frame = new JFrame("Homework 1");
        panel = new JPanel();
        button = new JButton("Button 1");
        label = new JLabel("Label 1!");
        textfield2 = new JTextField();
        textfield = new JTextField();

        //Step 3: organize the layout
//        panel.add(button, BorderLayout.NORTH);
//        panel.add(label, BorderLayout.CENTER);
//        panel.add(label2, BorderLayout.SOUTH);

        panel.add(label, BorderLayout.WEST);
        panel.add(button, BorderLayout.NORTH);
        panel.add(textfield2, BorderLayout.EAST);
        panel.add(textfield, BorderLayout.SOUTH);
        frame.add(panel);

        //Step 4: make frame appear
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        //frame.pack();
        frame.setVisible(true);
    }

}