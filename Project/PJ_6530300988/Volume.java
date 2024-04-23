package PJ_6530300988;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Volume extends JPanel
{
    //Attribute
    private JPanel volumePanel ;
    private JLabel label;
    private JButton enter ;
    private Font font = new Font("Courier new",Font.BOLD,20);
    private JComboBox<String> box1 , box2 ;
    private String[] scale1 = {"mm^3" , "cm^3", "ft^3" , "m^3" , "ml", "l"};
    private String[] scale2 = { "cm^3", "mm^3" , "ft^3" , "m^3" , "ml", "l"};
    private  JTextField textField1 ;
    private  JTextField textField2 ;
    private Double input , output ;
    private Color bgColor = new Color(25 , 55 , 175) ;
    private Color textColor = new Color(165 , 215 , 232);
    private Color button = new Color(87, 108, 188);

    public Volume()
    {
        //set layout
        setLayout(new BorderLayout());
        volumePanel = new JPanel(new FlowLayout());
        volumePanel.setBackground(bgColor);
        
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
        
        label = new JLabel("Volume");
        label.setFont(font);
        label.setForeground(textColor);
        label.setPreferredSize(new Dimension(500 ,50));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        
        //add all component
        volumePanel.add(label);
        volumePanel.add(textField1);
        volumePanel.add(box1);
        volumePanel.add(textField2);
        volumePanel.add(box2);
        volumePanel.add(enter);
        add(volumePanel,BorderLayout.CENTER);

        // addActionListener for check condition box1 to box2
        enter.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                try 
                {
                    input = Double.parseDouble(textField1.getText());

                    //Check mm^3
                    if (box1.getSelectedItem().toString().equals("mm^3") && box2.getSelectedItem().toString().equals("cm^3")) 
                    {
                        output = input * 0.001 ;

                    } else if (box1.getSelectedItem().toString().equals("mm^3") && box2.getSelectedItem().toString().equals("m^3")) 
                    {
                        output = input / 1000000000 ; 

                    }else if (box1.getSelectedItem().toString().equals("mm^3") && box2.getSelectedItem().toString().equals("ft^3")) 
                    {
                        output = input / 28316800.022182 ; 

                    }else if (box1.getSelectedItem().toString().equals("mm^3") && box2.getSelectedItem().toString().equals("ml")) 
                    {
                        output = input * 0.001 ;

                    }else if (box1.getSelectedItem().toString().equals("mm^3") && box2.getSelectedItem().toString().equals("l")) 
                    {
                        output = input *  0.000001 ; 

                    }else if (box1.getSelectedItem().toString().equals("mm^3") && box2.getSelectedItem().toString().equals("mm^3")) 
                    {
                        output = input * 1 ;

                    } else

                    //Check cm^3
                    if (box1.getSelectedItem().toString().equals("cm^3") && box2.getSelectedItem().toString().equals("mm^3")) 
                    {
                        output = input * 1000 ;

                    } else if (box1.getSelectedItem().toString().equals("cm^3") && box2.getSelectedItem().toString().equals("m^3")) 
                    {
                        output = input * 0.000001 ; 

                    }else if (box1.getSelectedItem().toString().equals("cm^3") && box2.getSelectedItem().toString().equals("ft^3")) 
                    {
                        output = input * 0.0000353147 ; 

                    }else if (box1.getSelectedItem().toString().equals("cm^3") && box2.getSelectedItem().toString().equals("ml")) 
                    {
                        output = input * 1 ;

                    }else if (box1.getSelectedItem().toString().equals("cm^3") && box2.getSelectedItem().toString().equals("l")) 
                    {
                        output = input *  0.001; 

                    }else if (box1.getSelectedItem().toString().equals("cm^3") && box2.getSelectedItem().toString().equals("cm^3")) 
                    {
                        output = input * 1 ;

                    } else

                    //Check ft^3
                    if (box1.getSelectedItem().toString().equals("ft^3") && box2.getSelectedItem().toString().equals("cm^3")) 
                    {
                        output = input * 28316.8000221 ;

                    } else if (box1.getSelectedItem().toString().equals("ft^3") && box2.getSelectedItem().toString().equals("m^3")) 
                    {
                        output = input * 0.0283168 ; 

                    }else if (box1.getSelectedItem().toString().equals("ft^3") && box2.getSelectedItem().toString().equals("mm^3")) 
                    {
                        output = input * 28316800.022182 ; 

                    }else if (box1.getSelectedItem().toString().equals("ft^3") && box2.getSelectedItem().toString().equals("ml")) 
                    {
                        output = input / 28316.800022182 ;

                    }else if (box1.getSelectedItem().toString().equals("ft^3") && box2.getSelectedItem().toString().equals("l")) 
                    {
                        output = input *  28.316800 ; 

                    }else if (box1.getSelectedItem().toString().equals("ft^3") && box2.getSelectedItem().toString().equals("ft^3")) 
                    {
                        output = input * 1 ;

                    } else
                    
                    //Check m^3
                    if (box1.getSelectedItem().toString().equals("m^3") && box2.getSelectedItem().toString().equals("mm^3")) 
                    {
                        output = input * 10000000000L ;

                    } else if (box1.getSelectedItem().toString().equals("m^3") && box2.getSelectedItem().toString().equals("cm^3")) 
                    {
                        output = input * 1000000 ; 

                    }else if (box1.getSelectedItem().toString().equals("m^3") && box2.getSelectedItem().toString().equals("ft^3")) 
                    {
                        output = input * 35.314724 ; 

                    }else if (box1.getSelectedItem().toString().equals("m^3") && box2.getSelectedItem().toString().equals("ml")) 
                    {
                        output = input * 1000000 ;

                    }else if (box1.getSelectedItem().toString().equals("m^3") && box2.getSelectedItem().toString().equals("l")) 
                    {
                        output = input *  0.001 ; 

                    }else if (box1.getSelectedItem().toString().equals("m^3") && box2.getSelectedItem().toString().equals("m^3")) 
                    {
                        output = input * 1 ;

                    } else

                    //Check ml
                    if (box1.getSelectedItem().toString().equals("ml") && box2.getSelectedItem().toString().equals("cm^3")) 
                    {
                        output = input * 1 ;

                    } else if (box1.getSelectedItem().toString().equals("ml") && box2.getSelectedItem().toString().equals("m^3")) 
                    {
                        output = input * 0.000001 ; 

                    }else if (box1.getSelectedItem().toString().equals("ml") && box2.getSelectedItem().toString().equals("ft^3")) 
                    {
                        output = input * 0.0000353147 ; 

                    }else if (box1.getSelectedItem().toString().equals("ml") && box2.getSelectedItem().toString().equals("mm^3")) 
                    {
                        output = input * 1000 ;

                    }else if (box1.getSelectedItem().toString().equals("ml") && box2.getSelectedItem().toString().equals("l")) 
                    {
                        output = input *  0.001 ; 

                    }else if (box1.getSelectedItem().toString().equals("ml") && box2.getSelectedItem().toString().equals("ml")) 
                    {
                        output = input * 1 ;

                    } else
                    
                    //Check l
                    if (box1.getSelectedItem().toString().equals("l") && box2.getSelectedItem().toString().equals("cm^3")) 
                    {
                        output = input * 1000 ;

                    } else if (box1.getSelectedItem().toString().equals("l") && box2.getSelectedItem().toString().equals("m^3")) 
                    {
                        output = input * 0.001 ; 

                    }else if (box1.getSelectedItem().toString().equals("l") && box2.getSelectedItem().toString().equals("ft^3")) 
                    {
                        output = input * 0.035314 ; 

                    }else if (box1.getSelectedItem().toString().equals("l") && box2.getSelectedItem().toString().equals("ml")) 
                    {
                        output = input * 1000 ;

                    }else if (box1.getSelectedItem().toString().equals("l") && box2.getSelectedItem().toString().equals("mm^3")) 
                    {
                        output = input *  1000000 ; 

                    } else if (box1.getSelectedItem().toString().equals("l") && box2.getSelectedItem().toString().equals("l")) 
                    {
                        output = input * 1 ;

                    } else
                    {
                        new Exception();
                    }
                    textField2.setText(""+ output);
                } catch (Exception Exception) 
                {
                    JOptionPane.showMessageDialog(Volume.this, "Please Input Number","Error : Not Integer",2);
                }
            }

        });
    }  
      
}