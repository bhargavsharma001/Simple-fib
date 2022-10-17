import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class calculator extends JFrame implements ActionListener
{
    JLabel l1;
    JLabel l3;
    JTextField t1;
    
    JButton b1;
    
    public calculator()
    {
        super("Simple fib");
        setLayout(new FlowLayout());
        l1=new JLabel("Enter number");
        l3=new JLabel("Result");
        b1=new JButton("Fibonacci");
        t1=new JTextField(20);
       
        add(l1);
        add(t1);
        add(b1);
        add(l3);

        b1.addActionListener(this);

    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            
            int m=Integer.parseInt(t1.getText());

            l3.setText(fibonacci(m)+" ");
        }
        
    }
    public int fibonacci(int m)
    {
        if(m==0)
            return 0; 
        else if(m==1)
            return 1;
        else
            return fibonacci(m-1)+fibonacci(m-2);
    }
}
public class calci 
{
    public static void main(String [] args)
    {
        calculator c=new calculator();
        c.setSize(400,400);
        c.setVisible(true);
        c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
