package Lab08_6530300988;

import java.awt.*; 
import javax.swing.*; 
import java.awt.event.*; 

public class Lab86Event extends JFrame 
{ 
    private JTextField textField1; 

    // global in actionPerformed() 
    public Lab86Event() 
    { 
        super( "Application" ); 
        Container c = getContentPane(); 
        c.setLayout( new FlowLayout() ); 
        
        // label and text entry field 
        Font font1 = new Font("Courier New", Font.BOLD, 20); 
        JLabel label1 = new JLabel("Enter your name:"); 
        label1.setFont(font1); 
        textField1 = new JTextField(25); 
        
        // 25 chars wide 
        textField1.setFont(font1); 
        c.add(label1); 
        c.add(textField1); 

        // Handle events from pressing return 
        textField1.addActionListener( new ActionListener() 
        { 
            public void actionPerformed(ActionEvent event) 
            { 
                System.out.println("You entered " +textField1.getText());
                textField1.setText(""); 
            } 
        } 
        ); 

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        setSize(480,360); 
        setVisible(true); 
    } 

    public static void main(String[] args) 
    { 
        new Lab86Event(); 
    } 
}
