package Homework08;

/*
 * Written by Phuriphat  Nokkhumthong
 * ID : 6530300988
 */

 import java.awt.*;
 import java.awt.event.*;
 import javax.swing.*;

 public class HW01GUI extends JFrame
 {
    //Attribute
    private JTextField tField ;
    private JButton button ;

    //Constructor
    public HW01GUI()
    {
        super("TextField And Button");

        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        c.setBackground(Color.black);

        //Create Font
        Font font = new Font("Roboto Mono",Font.BOLD,32);

        //Create Label
        JLabel label1 = new JLabel("Enter You Text Here");
        label1.setFont(font);
        label1.setForeground(Color.WHITE);
        c.add(label1);
        
        //Create TextField
        tField = new JTextField(15);
        tField.setFont(font);
        tField.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent event)
            {
                JOptionPane.showMessageDialog( c, tField.getText());
            }
        });
        c.add(tField);

        //Create button
        button = new JButton("Clear");
        button.setFont(font);
        button.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent event)
            {
                tField.setText("");
            }
        });
        c.add(button);

        setSize(460, 360);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) 
    {
        new HW01GUI();    
    }
 }