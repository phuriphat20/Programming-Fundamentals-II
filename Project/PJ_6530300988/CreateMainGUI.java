package PJ_6530300988;

import java.awt.*;
import javax.swing.*;

public class CreateMainGUI extends JFrame
{
    //Attribute
    private JPanel MainPanel ;
    private CardLayout cardLayout = new CardLayout();
    
    public CreateMainGUI()
    {
        //Create and setting frame
        super("Unit Convertor");
        setSize(500, 500);
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Create panel and cardLayout
        MainPanel = new JPanel(cardLayout) ;
    
        Start start = new Start();
        MainPanel.add(start, "1");

        ChooseMode mode = new ChooseMode();
        MainPanel.add(mode, "2");
        add(MainPanel);
        cardLayout.show(MainPanel, "1");

    }

}