package Homework09;

import javax.swing.*;

public class TestGUI03 extends JFrame
{
    public TestGUI03()
    {
        JPanel panel = new JPanel();
        GUI03ChangeBlush GUI3 = new GUI03ChangeBlush();
        panel.add(GUI3);
        
        setSize(1280, 720);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }    

    public static void main(String[] args) 
    {
        new TestGUI03();
    }
}
