
import javax.swing.*;
import java.awt.*;

public class FirstGUI {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        window1 w=new window1();

    }
}

class window1 extends JFrame{
    public window1(){
        setLayout(new FlowLayout(FlowLayout.CENTER));
        setTitle("First GUI");
        setVisible(true);
        setSize(300,300);
//        JLabel l1 = new JLabel("Hello World\n");
//        JLabel l2 = new JLabel("pratik Giri\n");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField t1 = new JTextField(10);
        JTextField t2 = new JTextField(10);
        JButton b1 = new JButton("Click Me");
//        add((l1));
//        add((l2));
        add(t1);
        add(t2);
        add(b1);




    }

}