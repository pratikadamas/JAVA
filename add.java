import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public  class add{
    public static void main(String[] args) {
        addtwonum ad = new addtwonum();

    }
}
class  addtwonum extends JFrame implements ActionListener {

    JTextField t1,t2;
    JButton b1;
    JLabel l1;


   public addtwonum(){
       setLayout(new FlowLayout(FlowLayout.CENTER));
       setSize(400, 300);
       setVisible(true);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       t1 = new JTextField(20);
       t2 = new JTextField(20);
       b1 = new JButton("Click Me");
       l1 = new JLabel("result");
       add(t1);
       add(t2);
       add(b1);
       add(l1);
       b1.addActionListener(this);

   }


   public void actionPerformed(ActionEvent e) {
       int a = Integer.parseInt(t1.getText());
       int b = Integer.parseInt(t2.getText());
       int c = a+b;
       l1.setText(Integer.toString(c));
   }
}
