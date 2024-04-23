package PJ_6530300988 ;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Start extends JPanel
{
    //Attribute
    private JPanel mainPage,startPanel ;
    private CardLayout cardLayout;
    private JLabel startLabel1 ;
    private Font font = new Font("Courier new",Font.BOLD,42);
    private Color bgColor = new Color(25 , 55 , 175) ;
    private Color textColor = new Color(165 , 215 , 232);
    private Color button = new Color(87, 108, 188);
    private JButton startButton ;

    public Start()
    {
        //set Layout
        setLayout(new BorderLayout());
        setVisible(true);

        //Create MainPage and set Layout 
        mainPage = new JPanel();
        cardLayout = new CardLayout();
        mainPage.setLayout(cardLayout);

        //Create and setting
        startPanel = new JPanel();

        startLabel1 = new JLabel(" Unit Convertor");
        startLabel1.setForeground(textColor);
        startButton = new JButton("Start") ;

        startLabel1.setFont(font);
        startLabel1.setPreferredSize(new Dimension(400 , 250));
        startLabel1.setHorizontalAlignment(SwingConstants.CENTER);
        startButton.setFont(font);
        startButton.setBackground(button);
        startButton.setForeground(textColor);
        startButton.setBorderPainted(false);
        startButton.setFocusPainted(false);
        

        startButton.setPreferredSize(new Dimension(200 , 50));

        // Create  object
        ChooseMode chooseType = new ChooseMode();

        // Use the CardLayout
        cardLayout.show(mainPage,"start");

        //addActionListener for Use  CardLayout
        startButton.addActionListener(new ActionListener() 
        {
            @Override 
            public void actionPerformed(ActionEvent e) 
            {
                cardLayout.show(mainPage,"Choose" );
            }
        });

        //add all Component 
        startPanel.add(startLabel1);
        startPanel.add(startButton);
        startPanel.setBackground(bgColor);
        mainPage.add(startPanel,"start");
        mainPage.add(chooseType,"Choose");
        add(mainPage,BorderLayout.CENTER);
        
    }
}