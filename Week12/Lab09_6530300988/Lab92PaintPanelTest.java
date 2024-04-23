package Lab09_6530300988;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Lab92PaintPanelTest
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Paint Application");
        Lab92PaintPanel Lab92 = new Lab92PaintPanel();
        Font font = new Font("Courier New",Font.BOLD + Font.ITALIC , 25);

        JLabel label = new JLabel("Drag the mouse to draw",SwingConstants.CENTER);
        label.setFont(font);
        label.setForeground(Color.BLACK);

        frame.add(Lab92);
        frame.add(label,BorderLayout.SOUTH);

        frame.setSize(600, 500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
    }   
}