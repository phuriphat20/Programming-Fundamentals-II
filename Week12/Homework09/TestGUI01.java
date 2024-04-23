package Homework09;

import javax.swing.JFrame;

public class TestGUI01 
{
    public static void main(String[] args) 
    {
        JFrame frame = new JFrame("Draw MR.Hat");
        GUI01 hat = new GUI01();

        frame.add(hat);

        frame.setSize(250, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
    }    
}
