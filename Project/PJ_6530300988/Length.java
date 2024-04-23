package PJ_6530300988;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Length extends JPanel
{
    //Attribute
    private JPanel lengthPanel ;
    private JLabel label;
    private JButton enter ;
    private Font font = new Font("Courier new",Font.BOLD,20);
    private JComboBox<String> box1 , box2 ;
    private String[] scale1 = { "mm" , "cm", "in", "ft"  , "yd" , "m" , "mi" , "km" };
    private String[] scale2 = { "cm","mm" , "in", "ft"  , "yd" , "m" , "mi" , "km" };
    private JTextField textField1 ;
    private JTextField textField2 ;
    private Double input , output;
    private Color bgColor = new Color(25 , 55 , 175) ;
    private Color textColor = new Color(165 , 215 , 232);
    private Color button = new Color(87, 108, 188);

    public Length()
    {
        //set Layout
        setLayout(new BorderLayout());
        lengthPanel = new JPanel(new FlowLayout());
        lengthPanel.setBackground(bgColor);

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

        label = new JLabel("Length");
        label.setFont(font);
        label.setForeground(textColor);
        label.setPreferredSize(new Dimension(500 ,50));
        label.setHorizontalAlignment(SwingConstants.CENTER);

        //add all component
        lengthPanel.add(label);
        lengthPanel.add(textField1);
        lengthPanel.add(box1);
        lengthPanel.add(textField2);
        lengthPanel.add(box2);
        lengthPanel.add(enter);
        add(lengthPanel,BorderLayout.CENTER);

        // addActionListener for check condition box1 to  box2
        enter.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                try 
                {
                    input = Double.parseDouble(textField1.getText());

                    //Check Km
                    if (box1.getSelectedItem().toString().equals("km") && box2.getSelectedItem().toString().equals("mm")) 
                    {
                        output = input * 1000000 ;

                    } else if (box1.getSelectedItem().toString().equals("km") && box2.getSelectedItem().toString().equals("cm")) 
                    {
                        output = input * 100000 ; 

                    }else if (box1.getSelectedItem().toString().equals("km") && box2.getSelectedItem().toString().equals("m")) 
                    {
                        output = input * 1000 ; 

                    }else if (box1.getSelectedItem().toString().equals("km") && box2.getSelectedItem().toString().equals("ft")) 
                    {
                        output = input * 3280.8399 ;

                    }else if (box1.getSelectedItem().toString().equals("km") && box2.getSelectedItem().toString().equals("mi")) 
                    {
                        output = input *  0.6214 ; 

                    }else if (box1.getSelectedItem().toString().equals("km") && box2.getSelectedItem().toString().equals("in")) 
                    {
                        output = input * 39370.0787 ; 

                    }else if (box1.getSelectedItem().toString().equals("km") && box2.getSelectedItem().toString().equals("yd")) 
                    {
                        output = input * 1093.6133 ; 

                    }else if (box1.getSelectedItem().toString().equals("km") && box2.getSelectedItem().toString().equals("km")) 
                    {
                        output = input * 1 ;

                    } else

                    //Check mi
                    if (box1.getSelectedItem().toString().equals("mi") && box2.getSelectedItem().toString().equals("mm")) 
                    {
                        output = input * 1609269.392 ;

                    } else if (box1.getSelectedItem().toString().equals("mi") && box2.getSelectedItem().toString().equals("cm")) 
                    {
                        output = input * 160926.939 ; 


                    }else if (box1.getSelectedItem().toString().equals("mi") && box2.getSelectedItem().toString().equals("m")) 
                    {
                        output = input * 1609.269 ; 

                    }else if (box1.getSelectedItem().toString().equals("mi") && box2.getSelectedItem().toString().equals("ft")) 
                    {
                        output = input * 5279.755 ; 

                    }else if (box1.getSelectedItem().toString().equals("mi") && box2.getSelectedItem().toString().equals("km")) 
                    {
                        output = input * 1.609 ; 

                    }else if (box1.getSelectedItem().toString().equals("mi") && box2.getSelectedItem().toString().equals("in")) 
                    {
                        output = input * 63357.062 ; 

                    }else if (box1.getSelectedItem().toString().equals("mi") && box2.getSelectedItem().toString().equals("yd")) 
                    {
                        output = input * 1759.918 ;

                    }else if (box1.getSelectedItem().toString().equals("mi") && box2.getSelectedItem().toString().equals("mi")) 
                    {
                        output = input * 1 ;

                    } else

                    //Check m
                    if (box1.getSelectedItem().toString().equals("m") && box2.getSelectedItem().toString().equals("mm")) 
                    {
                        output = input * 1000 ;

                    } else if (box1.getSelectedItem().toString().equals("m") && box2.getSelectedItem().toString().equals("cm")) 
                    {
                        output = input * 100 ; 

                    }else if (box1.getSelectedItem().toString().equals("m") && box2.getSelectedItem().toString().equals("km")) 
                    {
                        output = input / 1000 ; 

                    }else if (box1.getSelectedItem().toString().equals("m") && box2.getSelectedItem().toString().equals("ft")) 
                    {
                        output = input * 3.280 ; 

                    }else if (box1.getSelectedItem().toString().equals("m") && box2.getSelectedItem().toString().equals("mi")) 
                    {
                        output = input * 0.0006214 ; 
                    }else if (box1.getSelectedItem().toString().equals("m") && box2.getSelectedItem().toString().equals("in")) 
                    {
                        output = input * 39.370 ; 

                    }else if (box1.getSelectedItem().toString().equals("m") && box2.getSelectedItem().toString().equals("yd")) 
                    {
                        output = input * 1.093 ; 

                    }else if (box1.getSelectedItem().toString().equals("m") && box2.getSelectedItem().toString().equals("m")) 
                    {
                        output = input * 1 ;

                    } else
                    
                    //Check yd
                    if (box1.getSelectedItem().toString().equals("yd") && box2.getSelectedItem().toString().equals("mm")) 
                    {
                        output = input * 914.399 ;

                    } else if (box1.getSelectedItem().toString().equals("yd") && box2.getSelectedItem().toString().equals("cm")) 
                    {
                        output = input * 91.439 ; 

                    }else if (box1.getSelectedItem().toString().equals("yd") && box2.getSelectedItem().toString().equals("m")) 
                    {
                        output = input * 0.914 ; 

                    }else if (box1.getSelectedItem().toString().equals("yd") && box2.getSelectedItem().toString().equals("ft")) 
                    {
                        output = input * 2.999 ;

                    }else if (box1.getSelectedItem().toString().equals("yd") && box2.getSelectedItem().toString().equals("mi")) 
                    {
                        output = input * 0.000568 ; 

                    }else if (box1.getSelectedItem().toString().equals("yd") && box2.getSelectedItem().toString().equals("in")) 
                    {
                        output = input * 35.999; 

                    }else if (box1.getSelectedItem().toString().equals("yd") && box2.getSelectedItem().toString().equals("km")) 
                    {
                        output = input * 0.000914 ; 

                    }else if (box1.getSelectedItem().toString().equals("yd") && box2.getSelectedItem().toString().equals("yd")) 
                    {
                        output = input * 1 ;

                    } else

                    //Check ft
                    if (box1.getSelectedItem().toString().equals("ft") && box2.getSelectedItem().toString().equals("mm")) 
                    {
                        output = input * 304.799;

                    } else if (box1.getSelectedItem().toString().equals("ft") && box2.getSelectedItem().toString().equals("cm")) 
                    {
                        output = input * 30.479 ; 


                    }else if (box1.getSelectedItem().toString().equals("ft") && box2.getSelectedItem().toString().equals("m")) 
                    {
                        output = input * 0.3047; 

                    }else if (box1.getSelectedItem().toString().equals("ft") && box2.getSelectedItem().toString().equals("km")) 
                    {
                        output = input * 0.000304799; 

                    }else if (box1.getSelectedItem().toString().equals("ft") && box2.getSelectedItem().toString().equals("mi")) 
                    {
                        output = input * 0.000189402 ; 

                    }else if (box1.getSelectedItem().toString().equals("ft") && box2.getSelectedItem().toString().equals("in")) 
                    {
                        output = input * 11.999 ; 

                    }else if (box1.getSelectedItem().toString().equals("ft") && box2.getSelectedItem().toString().equals("yd")) 
                    {
                        output = input * 0.333333 ;

                    }else if (box1.getSelectedItem().toString().equals("ft") && box2.getSelectedItem().toString().equals("ft")) 
                    {
                        output = input * 1 ;

                    } else

                    //Check in
                    if (box1.getSelectedItem().toString().equals("in") && box2.getSelectedItem().toString().equals("mm")) 
                    {
                        output = input * 25.4000 ;

                    } else if (box1.getSelectedItem().toString().equals("in") && box2.getSelectedItem().toString().equals("cm")) 
                    {
                        output = input * 2.5400 ; 

                    }else if (box1.getSelectedItem().toString().equals("in") && box2.getSelectedItem().toString().equals("m")) 
                    {
                        output = input * 0.0254 ; 

                    }else if (box1.getSelectedItem().toString().equals("in") && box2.getSelectedItem().toString().equals("ft")) 
                    {
                        output = input * 0.083333; 

                    }else if (box1.getSelectedItem().toString().equals("in") && box2.getSelectedItem().toString().equals("mi")) 
                    {
                        output = input * 0.000015783 ; 

                    }else if (box1.getSelectedItem().toString().equals("in") && box2.getSelectedItem().toString().equals("km")) 
                    {
                        output = input * 0.000025400 ; 

                    }else if (box1.getSelectedItem().toString().equals("in") && box2.getSelectedItem().toString().equals("yd")) 
                    {
                        output = input * 0.02777 ; 

                    }else if (box1.getSelectedItem().toString().equals("in") && box2.getSelectedItem().toString().equals("in")) 
                    {
                        output = input * 1 ;

                    } else
                    
                    //Check cm
                    if (box1.getSelectedItem().toString().equals("cm") && box2.getSelectedItem().toString().equals("mm")) 
                    {
                        output = input * 10 ;

                    } else if (box1.getSelectedItem().toString().equals("cm") && box2.getSelectedItem().toString().equals("km")) 
                    {
                        output = input * 0.00001 ; 

                    }else if (box1.getSelectedItem().toString().equals("cm") && box2.getSelectedItem().toString().equals("m")) 
                    {
                        output = input * 0.01 ; 

                    }else if (box1.getSelectedItem().toString().equals("cm") && box2.getSelectedItem().toString().equals("ft")) 
                    {
                        output = input * 0.032808;
                        
                    }else if (box1.getSelectedItem().toString().equals("cm") && box2.getSelectedItem().toString().equals("mi")) 
                    {
                        output = input * 0.000006214; 

                    }else if (box1.getSelectedItem().toString().equals("cm") && box2.getSelectedItem().toString().equals("in")) 
                    {
                        output = input * 0.393 ; 

                    }else if (box1.getSelectedItem().toString().equals("cm") && box2.getSelectedItem().toString().equals("yd")) 
                    {
                        output = input * 0.01093 ; 

                    }else if (box1.getSelectedItem().toString().equals("cm") && box2.getSelectedItem().toString().equals("cm")) 
                    {
                        output = input * 1 ;

                    } else

                    //Check mm
                    if (box1.getSelectedItem().toString().equals("mm") && box2.getSelectedItem().toString().equals("km")) 
                    {
                        output = input * 0.000001 ;

                    } else if (box1.getSelectedItem().toString().equals("mm") && box2.getSelectedItem().toString().equals("cm")) 
                    {
                        output = input * 0.1 ; 

                    }else if (box1.getSelectedItem().toString().equals("mm") && box2.getSelectedItem().toString().equals("m")) 
                    {
                        output = input * 0.001 ; 

                    }else if (box1.getSelectedItem().toString().equals("mm") && box2.getSelectedItem().toString().equals("ft")) 
                    {
                        output = input * 0.003280 ; 

                    }else if (box1.getSelectedItem().toString().equals("mm") && box2.getSelectedItem().toString().equals("mi")) 
                    {
                        output = input / 1609269.391 ; 

                    }else if (box1.getSelectedItem().toString().equals("mm") && box2.getSelectedItem().toString().equals("in")) 
                    {
                        output = input * 0.039370; 

                    }else if (box1.getSelectedItem().toString().equals("mm") && box2.getSelectedItem().toString().equals("yd")) 
                    {
                        output = input * 0.0010936 ;

                    } else if (box1.getSelectedItem().toString().equals("mm") && box2.getSelectedItem().toString().equals("mm")) 
                    {
                        output = input * 1 ;

                    } else
                    {
                        new Exception();
                    }
                    textField2.setText(""+ output);
                } catch (Exception Exception) 
                {
                    JOptionPane.showMessageDialog(Length.this, "Please Input Number","Error : Not Integer",2);
                }
            }
            
        });

    }
    
}  