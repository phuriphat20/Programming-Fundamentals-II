package PJ_6530300988;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ChooseMode extends JPanel
{
    //Attribute
    private JPanel mainPanel , modePanel , labelPanel;
    private JButton aButton , eButton ,lButton ,pButton , vButton , wButton , homeButton;
    private JLabel modeLabel;
    private CardLayout cardLayout ;
    private Font font = new Font("Courier new",Font.BOLD,56);
    private Font font1 = new Font("Courier new",Font.BOLD,20);
    private Color bgColor = new Color(25 , 55 , 175) ;
    private Color textColor = new Color(165 , 215 , 232);
    private Color button = new Color(87, 108, 188);
    private ImageIcon areaIcon , energyIcon , lengthIcon ,pressureIcon , volumeIcon , weightIcon;

    public ChooseMode()
    {
        //set Layout
        setLayout(new BorderLayout());
        modePanel = new JPanel(new GridLayout(3,2));

        //Load picture
        areaIcon = new ImageIcon(new ImageIcon("D:/Fund 2/Project/PJ_6530300988/za.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
        energyIcon = new ImageIcon(new ImageIcon("D:/Fund 2/Project/PJ_6530300988/ze.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
        lengthIcon = new ImageIcon(new ImageIcon("D:/Fund 2/Project/PJ_6530300988/zl.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
        pressureIcon = new ImageIcon(new ImageIcon("D:/Fund 2/Project/PJ_6530300988/zp.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
        volumeIcon = new ImageIcon(new ImageIcon("D:/Fund 2/Project/PJ_6530300988/zv.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
        weightIcon = new ImageIcon(new ImageIcon("D:/Fund 2/Project/PJ_6530300988/zw.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));

        //Create MainPage and set Layout 
        mainPanel = new JPanel();
        cardLayout = new CardLayout();
        mainPanel.setLayout(cardLayout);
        mainPanel.setBackground(bgColor);

        //create panel
        labelPanel = new JPanel(new BorderLayout());

        //create  and setting
        modeLabel = new JLabel("Choose Mode");
        modeLabel.setFont(font);
        modeLabel.setForeground(textColor);
        modeLabel.setHorizontalAlignment(SwingConstants.CENTER);

        aButton = new JButton(areaIcon);
        aButton.setBackground(button);
        aButton.setFocusPainted(false);
        eButton = new JButton(energyIcon);
        eButton.setBackground(button);
        eButton.setFocusPainted(false);
        lButton = new JButton(lengthIcon);
        lButton.setBackground(button);
        lButton.setFocusPainted(false);
        pButton = new JButton(pressureIcon);
        pButton.setBackground(button);
        pButton.setFocusPainted(false);
        vButton = new JButton(volumeIcon);
        vButton.setBackground(button);
        vButton.setFocusPainted(false);
        wButton = new JButton(weightIcon);
        wButton.setBackground(button);
        wButton.setFocusPainted(false);

        //create panel and button
        JPanel homeButtonPanel = new JPanel();
        homeButtonPanel.setBackground(button);
        homeButton = new JButton("HOME");
        homeButton.setFont(font1);
        homeButton.setForeground(textColor);
        homeButton.setBackground(button);
        homeButton.setBorderPainted(false);
        homeButton.setFocusPainted(false);

        //addActionListener
        homeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(mainPanel, "Show");
                modeLabel.setVisible(true);
            }
        });

        //Event Handler for each button
        ModeButtonHandler modeHandler = new ModeButtonHandler();
        aButton.addActionListener(modeHandler);
        eButton.addActionListener(modeHandler);
        lButton.addActionListener(modeHandler);
        pButton.addActionListener(modeHandler);
        vButton.addActionListener(modeHandler);
        wButton.addActionListener(modeHandler);

         // Create  object
        Area area = new Area();
        Energy energy = new Energy();
        Length length = new Length();
        Pressure pressure = new Pressure();
        Volume volume = new Volume();
        Weight weight = new Weight();

        //add all Component 
        labelPanel.add(modeLabel, BorderLayout.SOUTH);
        labelPanel.setBackground(bgColor);
        add(labelPanel,BorderLayout.NORTH);

        homeButtonPanel.add(homeButton);
        labelPanel.add(homeButtonPanel, BorderLayout.WEST);

        modePanel.add(aButton);
        modePanel.add(eButton);
        modePanel.add(lButton);
        modePanel.add(pButton);
        modePanel.add(vButton);
        modePanel.add(wButton);
        modePanel.setBackground(button);
        mainPanel.add(modePanel , "Show");

        mainPanel.add(area , "area");
        mainPanel.add(energy , "energy");
        mainPanel.add(length , "length");
        mainPanel.add(pressure , "pressure");
        mainPanel.add(volume , "volume");
        mainPanel.add(weight , "weight");
        add(mainPanel,BorderLayout.CENTER);

        // Use the CardLayout
        cardLayout.show(mainPanel,"Show");
    }

    //InnerClass  for Use  CardLayout
    class ModeButtonHandler implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) 
        {
            if (e.getSource() == aButton) 
            {
                cardLayout.show(mainPanel, "area");
                

            }else if (e.getSource() == eButton) 
                {
                    cardLayout.show(mainPanel,"energy");

                }else if (e.getSource() == lButton) 
                    {
                        cardLayout.show(mainPanel,"length");

                    }else if (e.getSource() == pButton) 
                        {
                            cardLayout.show(mainPanel,"pressure");

                        }else if (e.getSource() == vButton) 
                            {
                                cardLayout.show(mainPanel,"volume");

                            }else if (e.getSource() == wButton) 
                                {
                                    cardLayout.show(mainPanel,"weight");
                                        
                                }
                                modeLabel.setVisible(false);
        }
    }  
}