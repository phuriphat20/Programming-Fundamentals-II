package Lab09_6530300988;

import javax.swing.*;

public class Lab91DrawSmileyTest 
{
    public static void main(String[] args) 
    {
        JFrame frame = new JFrame("DrawSmiley");
        Lab91DrawSmiley Lab91 = new Lab91DrawSmiley();

        frame.add(Lab91);

        frame.setSize(250, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
    }
}