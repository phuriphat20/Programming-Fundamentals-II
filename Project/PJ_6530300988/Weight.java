package PJ_6530300988;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Weight extends  JPanel 
{
    //Attribute
    private JPanel weightPanel ;
    private JLabel label;
    private JButton enter ;
    private Font font = new Font("Courier new",Font.BOLD,20);
    private JComboBox<String> box1 , box2 ;
    private String[] scale1 = {"mg" , "g", "kg" , "oz" , "lb", "t"};
    private String[] scale2 = { "g","mg", "kg" , "oz" , "lb", "t"};
    private  JTextField textField1 ;
    private  JTextField textField2 ;
    private Double input , output ;
    private Color bgColor = new Color(25 , 55 , 175) ;
    private Color textColor = new Color(165 , 215 , 232);
    private Color button = new Color(87, 108, 188);

    public Weight()
    {
        //set layout
        setLayout(new BorderLayout());
        weightPanel = new JPanel(new FlowLayout());
        
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
        
        label = new JLabel("Weight");
        label.setForeground(textColor);
        label.setFont(font);
        label.setPreferredSize(new Dimension(500 ,50));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        weightPanel.setBackground(bgColor);
        
        //add all component
        weightPanel.add(label);
        weightPanel.add(textField1);
        weightPanel.add(box1);
        weightPanel.add(textField2);
        weightPanel.add(box2);
        weightPanel.add(enter);
        add(weightPanel,BorderLayout.CENTER);

        // addActionListener for check condition box1 to box2
        enter.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                try 
                {
                    input = Double.parseDouble(textField1.getText());

                    //Check mg
                    if (box1.getSelectedItem().toString().equals("mg") && box2.getSelectedItem().toString().equals("g")) 
                    {
                        output = input * 0.001 ;

                    } else if (box1.getSelectedItem().toString().equals("mg") && box2.getSelectedItem().toString().equals("kg")) 
                    {
                        output = input * 0.000001 ; 

                    }else if (box1.getSelectedItem().toString().equals("mg") && box2.getSelectedItem().toString().equals("oz")) 
                    {
                        output = input * 0.000035273 ; 

                    }else if (box1.getSelectedItem().toString().equals("mg") && box2.getSelectedItem().toString().equals("lb")) 
                    {
                        output = input * 0.0000022046 ;

                    }else if (box1.getSelectedItem().toString().equals("mg") && box2.getSelectedItem().toString().equals("t")) 
                    {
                        output = input / 1000000000 ; 

                    }else if (box1.getSelectedItem().toString().equals("mg") && box2.getSelectedItem().toString().equals("mg")) 
                    {
                        output = input * 1 ;

                    } else

                    //Check g
                    if (box1.getSelectedItem().toString().equals("g") && box2.getSelectedItem().toString().equals("mg")) 
                    {
                        output = input * 1000 ;

                    } else if (box1.getSelectedItem().toString().equals("g") && box2.getSelectedItem().toString().equals("kg")) 
                    {
                        output = input * 0.001 ; 

                    }else if (box1.getSelectedItem().toString().equals("g") && box2.getSelectedItem().toString().equals("oz")) 
                    {
                        output = input * 0.03527396 ; 

                    }else if (box1.getSelectedItem().toString().equals("g") && box2.getSelectedItem().toString().equals("lb")) 
                    {
                        output = input * 0.00220462 ;

                    }else if (box1.getSelectedItem().toString().equals("g") && box2.getSelectedItem().toString().equals("t")) 
                    {
                        output = input *  0.000001 ; 

                    }else if (box1.getSelectedItem().toString().equals("g") && box2.getSelectedItem().toString().equals("g")) 
                    {
                        output = input * 1 ;

                    } else

                    //Check kg
                    if (box1.getSelectedItem().toString().equals("kg") && box2.getSelectedItem().toString().equals("g")) 
                    {
                        output = input * 1000 ;

                    } else if (box1.getSelectedItem().toString().equals("kg") && box2.getSelectedItem().toString().equals("mg")) 
                    {
                        output = input * 1000000 ; 

                    }else if (box1.getSelectedItem().toString().equals("kg") && box2.getSelectedItem().toString().equals("oz")) 
                    {
                        output = input * 35.273961 ; 

                    }else if (box1.getSelectedItem().toString().equals("kg") && box2.getSelectedItem().toString().equals("lb")) 
                    {
                        output = input * 2.204622 ;

                    }else if (box1.getSelectedItem().toString().equals("kg") && box2.getSelectedItem().toString().equals("t")) 
                    {
                        output = input *  0.001 ; 

                    }else if (box1.getSelectedItem().toString().equals("kg") && box2.getSelectedItem().toString().equals("kg")) 
                    {
                        output = input * 1 ;

                    } else
                    
                    //Check oz
                    if (box1.getSelectedItem().toString().equals("oz") && box2.getSelectedItem().toString().equals("g")) 
                    {
                        output = input * 28.349523 ;

                    } else if (box1.getSelectedItem().toString().equals("oz") && box2.getSelectedItem().toString().equals("kg")) 
                    {
                        output = input * 0.028349 ; 

                    }else if (box1.getSelectedItem().toString().equals("oz") && box2.getSelectedItem().toString().equals("mg")) 
                    {
                        output = input * 28349.523164 ; 

                    }else if (box1.getSelectedItem().toString().equals("oz") && box2.getSelectedItem().toString().equals("lb")) 
                    {
                        output = input * 0.062499 ;

                    }else if (box1.getSelectedItem().toString().equals("oz") && box2.getSelectedItem().toString().equals("t")) 
                    {
                        output = input *  0.000028349 ; 

                    }else if (box1.getSelectedItem().toString().equals("oz") && box2.getSelectedItem().toString().equals("oz")) 
                    {
                        output = input * 1 ;

                    } else

                    //Check lb
                    if (box1.getSelectedItem().toString().equals("lb") && box2.getSelectedItem().toString().equals("g")) 
                    {
                        output = input * 453.592374 ;

                    } else if (box1.getSelectedItem().toString().equals("lb") && box2.getSelectedItem().toString().equals("kg")) 
                    {
                        output = input * 0.453592 ; 

                    }else if (box1.getSelectedItem().toString().equals("lb") && box2.getSelectedItem().toString().equals("oz")) 
                    {
                        output = input * 16 ; 

                    }else if (box1.getSelectedItem().toString().equals("lb") && box2.getSelectedItem().toString().equals("mg")) 
                    {
                        output = input * 453592.374495 ;

                    }else if (box1.getSelectedItem().toString().equals("lb") && box2.getSelectedItem().toString().equals("t")) 
                    {
                        output = input *  0.000453592 ; 

                    }else if (box1.getSelectedItem().toString().equals("lb") && box2.getSelectedItem().toString().equals("lb")) 
                    {
                        output = input * 1 ;

                    } else
                    
                    //Check t
                    if (box1.getSelectedItem().toString().equals("t") && box2.getSelectedItem().toString().equals("g")) 
                    {
                        output = input * 1000000 ;

                    } else if (box1.getSelectedItem().toString().equals("t") && box2.getSelectedItem().toString().equals("kg")) 
                    {
                        output = input * 1000 ; 

                    }else if (box1.getSelectedItem().toString().equals("t") && box2.getSelectedItem().toString().equals("oz")) 
                    {
                        output = input * 35273.9619 ; 

                    }else if (box1.getSelectedItem().toString().equals("t") && box2.getSelectedItem().toString().equals("lb")) 
                    {
                        output = input * 2204.6226 ;

                    }else if (box1.getSelectedItem().toString().equals("t") && box2.getSelectedItem().toString().equals("mg")) 
                    {
                        output = input *  1000000000 ; 
                    }else if (box1.getSelectedItem().toString().equals("t") && box2.getSelectedItem().toString().equals("t")) 
                    {
                        output = input * 1 ;

                    } else
                    {
                        new Exception();
                    }
                    textField2.setText(""+ output);
                } catch (Exception Exception) 
                {
                    JOptionPane.showMessageDialog(Weight.this, "Please Input Number","Error : Not Integer",2);
                }
            }

        });
        
    }

}