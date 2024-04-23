package PJ_6530300988;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Energy extends JPanel
{
    //Attribute
    private JPanel energyPanel ;
    private JLabel label;
    private JButton enter ;
    private Font font = new Font("Courier new",Font.BOLD,20);
    private JComboBox<String> box1 , box2 ;
    private String[] scale1 = {"J/s" , "Btu/s", "hp" , "kcal/s" , "w", "kw"};
    private String[] scale2 = {"Btu/s" , "J/s" , "hp" , "kcal/s" , "w", "kw"};
    private  JTextField textField1 ;
    private  JTextField textField2 ;
    private Double input , output ;
    private Color bgColor = new Color(25 , 55 , 175) ;
    private Color textColor = new Color(165 , 215 , 232);
    private Color button = new Color(87, 108, 188);

    public Energy()
    {
        //set layout
        setLayout(new BorderLayout());
        energyPanel = new JPanel(new FlowLayout());
        energyPanel.setBackground(bgColor);
        
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
        
        
        label = new JLabel("Energy");
        label.setFont(font);
        label.setForeground(textColor);
        label.setPreferredSize(new Dimension(500 ,50));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        
        //add all component
        energyPanel.add(label);
        energyPanel.add(textField1);
        energyPanel.add(box1);
        energyPanel.add(textField2);
        energyPanel.add(box2);
        energyPanel.add(enter);
        add(energyPanel,BorderLayout.CENTER);

        // addActionListener for check condition box1 to box2
        enter.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                try 
                {
                    input = Double.parseDouble(textField1.getText());

                    //Check J/s
                    if (box1.getSelectedItem().toString().equals("J/s") && box2.getSelectedItem().toString().equals("Btu/s")) 
                    {
                        output = input * 0.000947817 ;

                    } else if (box1.getSelectedItem().toString().equals("J/s") && box2.getSelectedItem().toString().equals("hp")) 
                    {
                        output = input * 0.001341 ; 

                    }else if (box1.getSelectedItem().toString().equals("J/s") && box2.getSelectedItem().toString().equals("kcal/s")) 
                    {
                        output = input * 0.0002239 ; 

                    }else if (box1.getSelectedItem().toString().equals("J/s") && box2.getSelectedItem().toString().equals("w")) 
                    {
                        output = input * 1 ;

                    }else if (box1.getSelectedItem().toString().equals("J/s") && box2.getSelectedItem().toString().equals("kw")) 
                    {
                        output = input * 0.001 ; 

                    }else if(box1.getSelectedItem().toString().equals("J/s") && box2.getSelectedItem().toString().equals("J/s")) 
                    {
                        output = input * 1 ;

                    } else

                    //Check Btu/s
                    if (box1.getSelectedItem().toString().equals("Btu/s") && box2.getSelectedItem().toString().equals("J/s")) 
                    {
                        output = input * 1055.05587 ;

                    } else if (box1.getSelectedItem().toString().equals("Btu/s") && box2.getSelectedItem().toString().equals("hp")) 
                    {
                        output = input * 1.41485324 ; 

                    }else if (box1.getSelectedItem().toString().equals("Btu/s") && box2.getSelectedItem().toString().equals("kcal/s")) 
                    {
                        output = input * 0.25215835 ; 

                    }else if (box1.getSelectedItem().toString().equals("Btu/s") && box2.getSelectedItem().toString().equals("w")) 
                    {
                        output = input * 1055.05587 ;

                    }else if (box1.getSelectedItem().toString().equals("Btu/s") && box2.getSelectedItem().toString().equals("kw")) 
                    {
                        output = input * 1.05505587 ; 

                    }else if (box1.getSelectedItem().toString().equals("Btu/s") && box2.getSelectedItem().toString().equals("Btu/s")) 
                    {
                        output = input * 1 ;

                    } else

                    //Check hp
                    if (box1.getSelectedItem().toString().equals("hp") && box2.getSelectedItem().toString().equals("Btu/s")) 
                    {
                        output = input * 0.706787 ;

                    } else if (box1.getSelectedItem().toString().equals("hp") && box2.getSelectedItem().toString().equals("J/s")) 
                    {
                        output = input * 745.699865 ; 

                    }else if (box1.getSelectedItem().toString().equals("hp") && box2.getSelectedItem().toString().equals("kcal/s")) 
                    {
                        output = input * 0.178222267 ; 

                    }else if (box1.getSelectedItem().toString().equals("hp") && box2.getSelectedItem().toString().equals("w")) 
                    {
                        output = input * 745.699865 ;

                    }else if (box1.getSelectedItem().toString().equals("hp") && box2.getSelectedItem().toString().equals("kw")) 
                    {
                        output = input * 0.745699 ; 

                    }else if (box1.getSelectedItem().toString().equals("hp") && box2.getSelectedItem().toString().equals("hp")) 
                    {
                        output = input * 1 ;

                    } else
                    
                    //Check kcal/s
                    if (box1.getSelectedItem().toString().equals("kcal/s") && box2.getSelectedItem().toString().equals("Btu/s")) 
                    {
                        output = input * 3.965761 ;

                    } else if (box1.getSelectedItem().toString().equals("kcal/s") && box2.getSelectedItem().toString().equals("hp")) 
                    {
                        output = input * 5.610971 ; 

                    }else if (box1.getSelectedItem().toString().equals("kcal/s") && box2.getSelectedItem().toString().equals("J/s")) 
                    {
                        output = input * 4184.100418 ; 

                    }else if (box1.getSelectedItem().toString().equals("kcal/s") && box2.getSelectedItem().toString().equals("w")) 
                    {
                        output = input * 4184.100418  ;

                    }else if (box1.getSelectedItem().toString().equals("kcal/s") && box2.getSelectedItem().toString().equals("kw")) 
                    {
                        output = input * 4.184100 ; 

                    }else if (box1.getSelectedItem().toString().equals("kcal/s") && box2.getSelectedItem().toString().equals("kcal/s")) 
                    {
                        output = input * 1 ;

                    } else

                    //Check w
                    if (box1.getSelectedItem().toString().equals("w") && box2.getSelectedItem().toString().equals("Btu/s")) 
                    {
                        output = input * 0.00094781 ;

                    } else if (box1.getSelectedItem().toString().equals("w") && box2.getSelectedItem().toString().equals("hp")) 
                    {
                        output = input * 0.001341 ; 

                    }else if (box1.getSelectedItem().toString().equals("w") && box2.getSelectedItem().toString().equals("kcal/s")) 
                    {
                        output = input * 0.000239 ; 

                    }else if (box1.getSelectedItem().toString().equals("w") && box2.getSelectedItem().toString().equals("J/s")) 
                    {
                        output = input * 1;

                    }else if (box1.getSelectedItem().toString().equals("mg") && box2.getSelectedItem().toString().equals("kw")) 
                    {
                        output = input * 0.001 ; 

                    }else if (box1.getSelectedItem().toString().equals("w") && box2.getSelectedItem().toString().equals("w")) 
                    {
                        output = input * 1 ;

                    } else
                    
                    //Check kw
                    if (box1.getSelectedItem().toString().equals("kw") && box2.getSelectedItem().toString().equals("Btu/s")) 
                    {
                        output = input * 0.94781 ;

                    } else if (box1.getSelectedItem().toString().equals("kw") && box2.getSelectedItem().toString().equals("hp")) 
                    {
                        output = input * 1.3410221 ; 

                    }else if (box1.getSelectedItem().toString().equals("kw") && box2.getSelectedItem().toString().equals("kcal/s")) 
                    {
                        output = input * 0.239 ; 

                    }else if (box1.getSelectedItem().toString().equals("kw") && box2.getSelectedItem().toString().equals("w")) 
                    {
                        output = input * 1000 ;

                    }else if (box1.getSelectedItem().toString().equals("mg") && box2.getSelectedItem().toString().equals("J/s")) 
                    {
                        output = input * 1000 ; 

                    }else if (box1.getSelectedItem().toString().equals("kw") && box2.getSelectedItem().toString().equals("kw")) 
                    {
                        output = input * 1 ;

                    } else
                    {
                        new Exception();
                    }
                    textField2.setText(""+ output);
                } catch (Exception Exception) 
                {
                    JOptionPane.showMessageDialog(Energy.this, "Please Input Number","Error : Not Integer",2);
                }
            }
            
        });

    }  

}