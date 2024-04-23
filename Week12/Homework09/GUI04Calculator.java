package Homework09;

import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.event.*;


public class GUI04Calculator extends JFrame
{
    private JPanel mainPanel;
    private JTextField tField = new JTextField(30);
    Font font = new Font("Courier new",Font.PLAIN,20);

    public GUI04Calculator()
    {
        Container c = getContentPane();
        setTitle("Calculator");
        setLayout(new BorderLayout());
        JPanel tJPanel = new JPanel();
        tField.setFont(font);
        tJPanel.add(tField);

        JPanel kPanel = new JPanel();
        JPanel clsPanel = new JPanel();
        kPanel.setLayout(new GridLayout(5,4));
        clsPanel.add(new JButton("Cls")); 
        kPanel.add(new JButton("Bck")); 
        kPanel.add(kPanel); 
        kPanel.add(new JButton("Close")); 
        kPanel.add(new JButton("8")); 
        kPanel.add(new JButton("9")); 
        kPanel.add(new JButton("/")); 
        kPanel.add(new JButton("4")); 
        kPanel.add(new JButton("5")); 
        kPanel.add(new JButton("6")); 
        kPanel.add(new JButton("*")); 
        kPanel.add(new JButton("1")); 
        kPanel.add(new JButton("2")); 
        kPanel.add(new JButton("3")); 
        kPanel.add(new JButton("-")); 
        kPanel.add(new JButton("0")); 
        kPanel.add(new JButton(".")); 
        kPanel.add(new JButton("=")); 
        kPanel.add(new JButton("+")); 
        kPanel.setFont(font);
        clsPanel.setFont(font);
        
       ButtonHandler handler = new ButtonHandler();

       clsPanel.addActionListener(new ActionListener() 
       {
            public void actionPerformed(ActionEvent e)
            {
                tField.setText("");
            }
       });

       //kPanel.addActionListener(handler);
       //clsPanel.addActionListener(handler);

       mainPanel.add(clsPanel);
       mainPanel.add(kPanel);

      c.add(tField,BorderLayout.NORTH);
      c.add(mainPanel,BorderLayout.CENTER);
      c.add(new JPanel(), BorderLayout.EAST);
      c.add(new JPanel(), BorderLayout.SOUTH);
      c.add(new JPanel(), BorderLayout.WEST);

      setSize(500, 500);
      setVisible(true);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) 
    {
        new GUI04Calculator();
    }

    class ButtonHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            tField.setText(tField.getText() + e.getActionCommand());
        }
        
    }
}
