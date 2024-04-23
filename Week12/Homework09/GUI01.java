package Homework09;

import java.awt.*;
import javax.swing.*;

public class  GUI01 extends JPanel
{
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        //draw face
        g.setColor(Color.YELLOW);
        g.fillOval(10, 60, 200 , 200);

        //draw eye
        g.setColor(Color.BLACK);
        g.fillOval(55, 115, 30, 30);
        g.fillOval(135, 115,30,30);

        //draw mouth
        g.setColor(Color.red);
        g.fillOval(75, 195, 65, 15);

        //draw Smile
        g.setColor(Color.YELLOW);
        g.fillRect(75, 185, 65, 5);
        g.fillOval(75, 190, 65, 10);

        // draw right moustache 
        g.setColor(Color.black);
        g.fillOval(60, 170, 50, 20);
        g.setColor(Color.yellow);
        g.fillRect(60, 165, 50, 10);
        g.setColor(Color.yellow);
        g.fillOval(55, 170, 45, 10);

        // draw  left moustache 
        g.setColor(Color.black);
        g.fillOval(105, 170, 50, 20);
        g.setColor(Color.yellow);
        g.fillRect(105, 165, 50, 10);
        g.setColor(Color.yellow);
        g.fillOval(115, 170, 45, 10);
        g.setColor(Color.yellow);
        g.fillOval(115, 170, 45, 10);

        //draw Hat
        g.setColor(Color.black);
        g.fillRect(10, 80, 200, 20);
        g.fillRect(35, 0, 150, 80);
        g.setColor(Color.blue);
        g.fillRect(35, 50, 150, 20); 
    }        
}    