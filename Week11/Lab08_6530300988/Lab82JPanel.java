package Lab08_6530300988;

import java.awt.Color;
import javax.swing.*;

public class Lab82JPanel 
{
    public static void main(String[] args) 
    {
        JFrame frame = new JFrame("My Frame");
        frame.setSize(300, 200);

        JPanel panel = new JPanel();
        panel.setBackground(Color.BLACK);
        frame.add(panel);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
    }    
}