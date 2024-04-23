package Homework08;

/*
 * Written by Phuriphat  Nokkhumthong
 * ID : 6530300988
 */

 import javax.swing.*;
 import java.awt.*;
 import java.awt.event.*;

public class HW02GUISwap extends JFrame 
{
    //Attribute
    private JTextField textField1 , textField2 ;
    private JCheckBox checkBox1 , checkBox2 ;
    private JLabel label1 ;
    private JButton button1 , button2 ;
    private int checkSwap = 1 ;
    private int checkModify = 0 ; 
    
    //Constructor
    public HW02GUISwap()
    {
        super("Swap");

        //Create Container for add many panel
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        c.setBackground(Color.black);

        //Create Font
        Font font = new Font("Roboto Mono",Font.BOLD,20);

        //Create label
        JLabel label = new JLabel("Swap App");
        label.setFont(new Font("Roboto Mono", Font.BOLD + Font.ITALIC,30));
        label.setForeground(Color.WHITE);

        //Add label to Panel
        JPanel labelPanel =new JPanel();
        labelPanel.add(label1);
        labelPanel.setBackground(Color.BLACK);
        labelPanel.setPreferredSize(new Dimension(400,50));
        c.add(labelPanel);

        //Create TextField
        textField1 = new JTextField(15);
        textField1.setFont(font);
        textField2 = new JTextField(15);
        textField2.setFont(font);

        //Add TextField to Panel
        JPanel textJPanel = new JPanel();
        textJPanel.add(textField1);
        textJPanel.add(textField2);
        textJPanel.setBackground(Color.BLACK);
        c.add(textJPanel);

        //Create CheckBox
        checkBox1 = new JCheckBox("Swap",true) ;
        checkBox1.setFont(font);
        checkBox1.setBackground(Color.BLACK);
        checkBox1.setForeground(Color.WHITE);

        checkBox2 = new JCheckBox("Modify on Swap");
        checkBox2.setFont(font);
        checkBox2.setBackground(Color.BLACK);
        checkBox2.setForeground(Color.WHITE);

        //Add CheckBox to Panel
        JPanel checkJPanel = new JPanel();
        checkJPanel.add(checkBox1);
        checkJPanel.add(checkBox2);
        checkJPanel.setBackground(Color.BLACK);
        c.add(checkJPanel);

        //Create button
        button1 = new JButton("Submit");
        button1.setFont(font);
        button1.setBackground(Color.WHITE);

        button2 = new JButton("Clear");
        button2.setFont(font);
        button2.setBackground(Color.WHITE);

        //Add button to Panel
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(button1);
        buttonPanel.add(button2);
        buttonPanel.setBackground(Color.BLACK);
        buttonPanel.setPreferredSize(new Dimension(400,50));
        c.add(buttonPanel);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(button1);
        buttonGroup.add(button2);

        //Create Blank label1 wait for result
        JLabel label1 = new JLabel();
        label1.setFont(font);
        label1.setForeground(Color.WHITE);

        //Add label1 to Panel
        JPanel label1JPanel = new JPanel();
        label1JPanel.add(label1);
        label1JPanel.setBackground(Color.BLACK);
        c.add(label1JPanel);

        checkBox1.addItemListener( new ItemListener() 
        { 
            public void itemStateChanged(ItemEvent e)
            { 
                if (e.getStateChange() == ItemEvent.SELECTED)
                { 
                    System.out.print("Swap"); 
                    checkSwap = 1; 
            }   else
                { 
                    System.out.print("de-Swap "); 
                    checkSwap = 0;
                }
            } 
        }); 

        checkBox2.addItemListener( new ItemListener()
        { 
            public void itemStateChanged(ItemEvent e)
            { 
                if (e.getStateChange() == ItemEvent.SELECTED)
                {
                    System.out.print("ModifyOnSwap"); 
                    checkModify = 1; 
                } else
                { 
                    System.out.print("de - ModifyOnSwap"); 
                    checkModify = 0;
                }
            } 
        });

        button1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if(checkSwap == 1 && checkModify == 1)
                {
                    label.setText(textField2.getText() + textField1.getText());
                    String temp = textField1.getText();
                    textField1.setText(textField2.getText());
                    textField2.setText(temp);
                } else if(checkSwap == 1 && checkModify == 0)
                {
                    label.setText(textField2.getText() + textField1.getText());
                }
            }
        });

        button2.addActionListener(new ActionListener()
        {
            public void  actionPerformed(ActionEvent e)
            {
                textField1.setText("");
                textField2.setText("");
                label1.setText("");
            }
        });


        setSize(420, 320);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) 
    {
        new HW02GUISwap();  
    }
}