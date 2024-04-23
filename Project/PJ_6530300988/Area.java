package PJ_6530300988;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Area extends JPanel
{
    //attribute
    private JPanel areaPanel ;
    private JLabel label;
    private JButton enter  ;
    private Font font = new Font("Courier new",Font.BOLD,20);
    private JComboBox<String> box1 , box2 ;
    private String[] scale1 = {"mm^2" , "cm^2", "in^2", "yd^2" , "ft^2"  , "m^2" , "mi^2", "km^2"};
    private String[] scale2 = {"cm^2" , "mm^2" , "in^2", "yd^2" , "ft^2"  , "m^2" , "mi^2", "km^2"};
    private  JTextField textField1 ;
    private  JTextField textField2 ;
    private Double input , output ;
    private Color bgColor = new Color(25 , 55 , 175) ;
    private Color textColor = new Color(165 , 215 , 232);
    private Color button = new Color(87, 108, 188);
    
    public Area()
    {
        //set layout
        setLayout(new BorderLayout());
        areaPanel = new JPanel();
        areaPanel.setBackground(bgColor);
        
        //create and setting
        textField1 = new JTextField(35);
        textField2 = new JTextField(35);
        textField2.setFocusable(false);
        
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
        
        label = new JLabel("Area");
        label.setFont(font);
        label.setForeground(textColor);
        label.setPreferredSize(new Dimension(500 ,50));
        label.setHorizontalAlignment(SwingConstants.CENTER);

        //add all component
        areaPanel.add(label);
        areaPanel.add(textField1);
        areaPanel.add(box1);
        areaPanel.add(textField2);
        areaPanel.add(box2);
        areaPanel.add(enter);
        add(areaPanel,BorderLayout.CENTER);
        
        // addActionListener for check condition box1 to box2
        enter.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                try 
                {
                    input = Double.parseDouble(textField1.getText());

                    //Check Km^2
                    if (box1.getSelectedItem().toString().equals("km^2") && box2.getSelectedItem().toString().equals("mm^2")) 
                    {
                        output = input * 1000000000000L ;

                    } else if (box1.getSelectedItem().toString().equals("km^2") && box2.getSelectedItem().toString().equals("cm^2")) 
                    {
                        output = input * 10000000000L ; 

                    }else if (box1.getSelectedItem().toString().equals("km^2") && box2.getSelectedItem().toString().equals("m^2")) 
                    {
                        output = input * 1000000 ; 

                    }else if (box1.getSelectedItem().toString().equals("km^2") && box2.getSelectedItem().toString().equals("ft^2")) 
                    {
                        output = input * 10763910.4 ;

                    }else if (box1.getSelectedItem().toString().equals("km^2") && box2.getSelectedItem().toString().equals("mi^2")) 
                    {
                        output = input *  0.3861 ; 

                    }else if (box1.getSelectedItem().toString().equals("km^2") && box2.getSelectedItem().toString().equals("in^2")) 
                    {
                        output = input * 1550003100 ; 

                    }else if (box1.getSelectedItem().toString().equals("km^2") && box2.getSelectedItem().toString().equals("yd^2")) 
                    {
                        output = input * 1195990 ; 

                    }else if (box1.getSelectedItem().toString().equals("km^2") && box2.getSelectedItem().toString().equals("km^2")) 
                    {
                        output = input * 1 ;

                    } else

                    //Check mi^2
                    if (box1.getSelectedItem().toString().equals("mi^2") && box2.getSelectedItem().toString().equals("mm^2")) 
                    {
                        output = input * 2590002590002.59 ;

                    } else if (box1.getSelectedItem().toString().equals("mi^2") && box2.getSelectedItem().toString().equals("cm^2")) 
                    {
                        output = input * 25900025900.025 ; 


                    }else if (box1.getSelectedItem().toString().equals("mi^2") && box2.getSelectedItem().toString().equals("m^2")) 
                    {
                        output = input * 2590002.59 ; 

                    }else if (box1.getSelectedItem().toString().equals("mi^2") && box2.getSelectedItem().toString().equals("ft^2")) 
                    {
                        output = input * 27878555.814 ; 

                    }else if (box1.getSelectedItem().toString().equals("mi^2") && box2.getSelectedItem().toString().equals("km^2")) 
                    {
                        output = input * 2.590 ; 

                    }else if (box1.getSelectedItem().toString().equals("mi^2") && box2.getSelectedItem().toString().equals("in^2")) 
                    {
                        output = input * 4014512043.512 ; 

                    }else if (box1.getSelectedItem().toString().equals("mi^2") && box2.getSelectedItem().toString().equals("yd^2")) 
                    {
                        output = input * 3097617.197 ;

                    }else if (box1.getSelectedItem().toString().equals("mi^2") && box2.getSelectedItem().toString().equals("mi^2")) 
                    {
                        output = input * 1 ;

                    } else

                    //Check m^2
                    if (box1.getSelectedItem().toString().equals("m^2") && box2.getSelectedItem().toString().equals("mm^2")) 
                    {
                        output = input * 1000000 ;

                    } else if (box1.getSelectedItem().toString().equals("m^2") && box2.getSelectedItem().toString().equals("cm^2")) 
                    {
                        output = input * 10000 ; 

                    }else if (box1.getSelectedItem().toString().equals("m^2") && box2.getSelectedItem().toString().equals("km^2")) 
                    {
                        output = input * 0.000001 ; 

                    }else if (box1.getSelectedItem().toString().equals("m^2") && box2.getSelectedItem().toString().equals("ft^2")) 
                    {
                        output = input * 310.763 ; 

                    }else if (box1.getSelectedItem().toString().equals("m^2") && box2.getSelectedItem().toString().equals("mi^2")) 
                    {
                        output = input / 2590002.590 ; 

                    }else if (box1.getSelectedItem().toString().equals("m^2") && box2.getSelectedItem().toString().equals("in^2")) 
                    {
                        output = input * 1550.0031 ; 

                    }else if (box1.getSelectedItem().toString().equals("m^2") && box2.getSelectedItem().toString().equals("yd^2")) 
                    {
                        output = input * 1.19599 ; 

                    }else if (box1.getSelectedItem().toString().equals("m^2") && box2.getSelectedItem().toString().equals("m^2")) 
                    {
                        output = input * 1 ;

                    } else 
                    
                    //Check yd^2
                    if (box1.getSelectedItem().toString().equals("yd^2") && box2.getSelectedItem().toString().equals("mm^2")) 
                    {
                        output = input * 836127.392 ;

                    } else if (box1.getSelectedItem().toString().equals("yd^2") && box2.getSelectedItem().toString().equals("cm^2")) 
                    {
                        output = input * 8361.273 ; 

                    }else if (box1.getSelectedItem().toString().equals("yd^2") && box2.getSelectedItem().toString().equals("m^2")) 
                    {
                        output = input *0.83612 ; 

                    }else if (box1.getSelectedItem().toString().equals("yd^2") && box2.getSelectedItem().toString().equals("ft^2")) 
                    {
                        output = input * 9.0000003 ;

                    }else if (box1.getSelectedItem().toString().equals("yd") && box2.getSelectedItem().toString().equals("mi")) 
                    {
                        output = input / 3097617.197 ; 

                    }else if (box1.getSelectedItem().toString().equals("yd") && box2.getSelectedItem().toString().equals("in")) 
                    {
                        output = input * 1096.00005 ; 

                    }else if (box1.getSelectedItem().toString().equals("yd") && box2.getSelectedItem().toString().equals("km")) 
                    {
                        output = input / 1195990 ; 

                    }else if (box1.getSelectedItem().toString().equals("yd^2") && box2.getSelectedItem().toString().equals("yd^2")) 
                    {
                        output = input * 1 ;

                    } else

                    //Check ft^2
                    if (box1.getSelectedItem().toString().equals("ft^2") && box2.getSelectedItem().toString().equals("mm^2")) 
                    {
                        output = input * 92903.040 ;

                    } else if (box1.getSelectedItem().toString().equals("ft^2") && box2.getSelectedItem().toString().equals("cm^2")) 
                    {
                        output = input * 929.030 ; 


                    }else if (box1.getSelectedItem().toString().equals("ft^2") && box2.getSelectedItem().toString().equals("m^2")) 
                    {
                        output = input * 0.0929 ; 

                    }else if (box1.getSelectedItem().toString().equals("ft^2") && box2.getSelectedItem().toString().equals("km^2")) 
                    {
                        output = input / 10763910.4 ; 

                    }else if (box1.getSelectedItem().toString().equals("ft^2") && box2.getSelectedItem().toString().equals("mi^2")) 
                    {
                        output = input / 27878555.8145558 ; 

                    }else if (box1.getSelectedItem().toString().equals("ft^2") && box2.getSelectedItem().toString().equals("in^2")) 
                    {
                        output = input * 144 ; 

                    }else if (box1.getSelectedItem().toString().equals("ft^2") && box2.getSelectedItem().toString().equals("yd^2")) 
                    {
                        output = input * 0.11111 ;

                    }else if (box1.getSelectedItem().toString().equals("ft^2") && box2.getSelectedItem().toString().equals("ft^2")) 
                    {
                        output = input * 1 ;

                    } else

                    //Check in^2
                    if (box1.getSelectedItem().toString().equals("in^2") && box2.getSelectedItem().toString().equals("mm^2")) 
                    {
                        output = input * 645.160 ;

                    } else if (box1.getSelectedItem().toString().equals("in^2") && box2.getSelectedItem().toString().equals("cm^2")) 
                    {
                        output = input * 6.4516 ; 

                    }else if (box1.getSelectedItem().toString().equals("in^2") && box2.getSelectedItem().toString().equals("m^2")) 
                    {
                        output = input * 0.00064516 ; 

                    }else if (box1.getSelectedItem().toString().equals("in^2") && box2.getSelectedItem().toString().equals("ft^2")) 
                    {
                        output = input * 0.006944 ; 

                    }else if (box1.getSelectedItem().toString().equals("in^2") && box2.getSelectedItem().toString().equals("mi^2")) 
                    {
                        output = input / 4014512043.512043 ; 

                    }else if (box1.getSelectedItem().toString().equals("in^2") && box2.getSelectedItem().toString().equals("km^2")) 
                    {
                        output = input / 1550003100 ; 

                    }else if (box1.getSelectedItem().toString().equals("in") && box2.getSelectedItem().toString().equals("yd")) 
                    {
                        output = input * 0.000771604 ; 

                    }else if (box1.getSelectedItem().toString().equals("in^2") && box2.getSelectedItem().toString().equals("in^2")) 
                    {
                        output = input * 1 ;

                    } else
                    
                    //Check cm^2
                    if (box1.getSelectedItem().toString().equals("cm^2") && box2.getSelectedItem().toString().equals("mm^2")) 
                    {
                        output = input * 100 ;

                    } else if (box1.getSelectedItem().toString().equals("cm^2") && box2.getSelectedItem().toString().equals("km^2")) 
                    {
                        output = input / 10000000000L ; 

                    }else if (box1.getSelectedItem().toString().equals("cm^2") && box2.getSelectedItem().toString().equals("m^2")) 
                    {
                        output = input * 0.0001 ; 

                    }else if (box1.getSelectedItem().toString().equals("cm^2") && box2.getSelectedItem().toString().equals("ft^2")) 
                    {
                        output = input * 0.00107639 ;
                        
                    }else if (box1.getSelectedItem().toString().equals("cm^2") && box2.getSelectedItem().toString().equals("mi^2")) 
                    {
                        output = input / 25900025900.0259 ; 

                    }else if (box1.getSelectedItem().toString().equals("cm^2") && box2.getSelectedItem().toString().equals("in^2")) 
                    {
                        output = input * 0.1550 ; 

                    }else if (box1.getSelectedItem().toString().equals("cm") && box2.getSelectedItem().toString().equals("yd")) 
                    {
                        output = input * 0.000119599 ; 

                    }else if (box1.getSelectedItem().toString().equals("cm^2") && box2.getSelectedItem().toString().equals("cm^2")) 
                    {
                        output = input * 1 ;

                    } else

                    //Check mm^2
                    if (box1.getSelectedItem().toString().equals("mm^2") && box2.getSelectedItem().toString().equals("km^2")) 
                    {
                        output = input / 1000000000000L ;

                    } else if (box1.getSelectedItem().toString().equals("mm^2") && box2.getSelectedItem().toString().equals("cm^2")) 
                    {
                        output = input * 0.01 ; 

                    }else if (box1.getSelectedItem().toString().equals("mm^2") && box2.getSelectedItem().toString().equals("m^2")) 
                    {
                        output = input * 0.000001 ; 

                    }else if (box1.getSelectedItem().toString().equals("mm^2") && box2.getSelectedItem().toString().equals("ft^2")) 
                    {
                        output = input * 0.0000107639 ; 

                    }else if (box1.getSelectedItem().toString().equals("mm^2") && box2.getSelectedItem().toString().equals("mi^2")) 
                    {
                        output = input / 2590002590002.590 ; 

                    }else if (box1.getSelectedItem().toString().equals("mm^2") && box2.getSelectedItem().toString().equals("in^2")) 
                    {
                        output = input * 0.001550 ; 

                    }else if (box1.getSelectedItem().toString().equals("mm^2") && box2.getSelectedItem().toString().equals("yd^2")) 
                    {
                        output = input * 0.00000119599 ;

                    } else if (box1.getSelectedItem().toString().equals("mm^2") && box2.getSelectedItem().toString().equals("mm^2")) 
                    {
                        output = input * 1 ;

                    } else
                    {
                        new Exception();
                    }
                    textField2.setText("" + output);
                } catch (Exception Exception) 
                {
                    JOptionPane.showMessageDialog(Area.this, "Please Input Number","Error : Not Integer",2);
                }
            }

        });

    }    
}