package PJ_6530300988;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Pressure extends JPanel
{
    //Attribute
    private JPanel pressurePanel ;
    private JLabel label;
    private JButton enter ;
    private Font font = new Font("Courier new",Font.BOLD,20);
    private JComboBox<String> box1 , box2 ;
    private String[] scale1 = {"mmHg" , "bar", "atm" , "kPa"};
    private String[] scale2 = {"bar" , "mmHg" , "atm" , "kPa"};
    private  JTextField textField1 ;
    private  JTextField textField2 ;
    private Double input , output ;
    private Color bgColor = new Color(25 , 55 , 175) ;
    private Color textColor = new Color(165 , 215 , 232);
    private Color button = new Color(87, 108, 188);

    public Pressure()
    {
        //set Layout
        setLayout(new BorderLayout());
        pressurePanel = new JPanel(new FlowLayout());
        pressurePanel.setBackground(bgColor);
        
        //create and setting
        enter = new JButton("Enter");
        enter.setPreferredSize(new Dimension(100, 50));
        enter.setFont(font);
        enter.setForeground(textColor);
        enter.setBackground(button);
        enter.setBorderPainted(false);
        enter.setFocusPainted(false);

        box1 = new JComboBox<String>(scale1);
        box1.setFont(font);
        box1.setBackground(textColor);
        box2 = new JComboBox<String>(scale2);
        box2.setFont(font);
        box2.setBackground(textColor);
        
        textField1 = new JTextField(35);
        textField2 = new JTextField(35);
        textField2.setFocusable(false);
        
        label = new JLabel("Pressure");
        label.setForeground(textColor);
        label.setFont(font);
        label.setPreferredSize(new Dimension(500 ,50));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        
        //add all component
        pressurePanel.add(label);
        pressurePanel.add(textField1);
        pressurePanel.add(box1);
        pressurePanel.add(textField2);
        pressurePanel.add(box2);
        pressurePanel.add(enter);
        add(pressurePanel,BorderLayout.CENTER);

        // addActionListener for check condition box1 to box2
        enter.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                try 
                {
                    input = Double.parseDouble(textField1.getText());

                    //Check mmHg
                    if (box1.getSelectedItem().toString().equals("mmHg") && box2.getSelectedItem().toString().equals("bar")) 
                    {
                        output = input * 0.001333 ;

                    } else if (box1.getSelectedItem().toString().equals("mmHg") && box2.getSelectedItem().toString().equals("atm")) 
                    {
                        output = input * 0.001315 ; 

                    }else if (box1.getSelectedItem().toString().equals("mmHg") && box2.getSelectedItem().toString().equals("kPa")) 
                    {
                        output = input * 0.133322 ; 

                    }else if (box1.getSelectedItem().toString().equals("mmHg") && box2.getSelectedItem().toString().equals("mmHg")) 
                    {
                        output = input * 1 ;

                    } else

                    //Check bar
                    if (box1.getSelectedItem().toString().equals("bar") && box2.getSelectedItem().toString().equals("mmHg")) 
                    {
                        output = input * 750.061 ;

                    } else if (box1.getSelectedItem().toString().equals("bar") && box2.getSelectedItem().toString().equals("atm")) 
                    {
                        output = input * 0.986923 ; 

                    }else if (box1.getSelectedItem().toString().equals("bar") && box2.getSelectedItem().toString().equals("kPa")) 
                    {
                        output = input * 100 ; 

                    }else if (box1.getSelectedItem().toString().equals("bar") && box2.getSelectedItem().toString().equals("bar")) 
                    {
                        output = input * 1 ;

                    } else

                    //Check atm
                    if (box1.getSelectedItem().toString().equals("atm") && box2.getSelectedItem().toString().equals("bar")) 
                    {
                        output = input * 1.013250 ;

                    } else if (box1.getSelectedItem().toString().equals("atm") && box2.getSelectedItem().toString().equals("mmHg")) 
                    {
                        output = input * 760.00 ; 

                    }else if (box1.getSelectedItem().toString().equals("atm") && box2.getSelectedItem().toString().equals("kPa")) 
                    {
                        output = input * 101.325027 ; 

                    }else if (box1.getSelectedItem().toString().equals("atm") && box2.getSelectedItem().toString().equals("atm")) 
                    {
                        output = input * 1 ;

                    } else
                    
                    //Check kPa
                    if (box1.getSelectedItem().toString().equals("kPa") && box2.getSelectedItem().toString().equals("bar")) 
                    {
                        output = input * 0.01 ;

                    } else if (box1.getSelectedItem().toString().equals("kPa") && box2.getSelectedItem().toString().equals("atm")) 
                    {
                        output = input * 0.009869 ; 

                    }else if (box1.getSelectedItem().toString().equals("kPa") && box2.getSelectedItem().toString().equals("mmHg")) 
                    {
                        output = input * 7.500617 ; 

                    }else if (box1.getSelectedItem().toString().equals("kPa") && box2.getSelectedItem().toString().equals("kPa")) 
                    {
                        output = input * 1 ;

                    } else
                    {
                        new Exception();
                    }
                    textField2.setText(""+ output);
                } catch (Exception Exception) 
                {
                    JOptionPane.showMessageDialog(Pressure.this, "Please Input Number","Error : Not Integer",2);
                }
            }

        });
        
    }

}