import javax.swing.*;
import java.awt.*;

public class Practice1 {

    //Step 1: declare variables
    private JFrame frame;
    private JPanel panel;
    private JButton button;
    private JLabel label;
    private JTextField textfield;


    public static void main(String[] args) {
        Practice1 p = new Practice1();
    }

    public Practice1(){
        //Step 2: construct variables
        frame = new JFrame("Practice 1");
        panel = new JPanel(new GridLayout(2,2));
        button = new JButton("Click here!");
        label = new JLabel("Label!");
        textfield = new JTextField();

        //Step 3: organize the layout
//        panel.add(button, BorderLayout.NORTH);
//        panel.add(label, BorderLayout.CENTER);

        panel.add(button);
        panel.add(label);
        frame.add(panel);
        panel.add(textfield);

        //Step 4: make frame appear
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        //frame.pack();
        frame.setVisible(true);
    }

}