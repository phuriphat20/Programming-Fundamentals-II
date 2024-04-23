package Homework09;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class TestGUI02
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Paint Application");
        GUI02 test02 = new GUI02();
        Font font = new Font("Courier New",Font.BOLD + Font.ITALIC , 25);

        JLabel label = new JLabel("Drag the mouse to draw",SwingConstants.CENTER);
        label.setFont(font);
        label.setForeground(Color.BLACK);

        frame.add(test02);
        frame.add(label,BorderLayout.SOUTH);

        frame.setSize(600, 500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
    }   
}