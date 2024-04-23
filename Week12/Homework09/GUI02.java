package Homework09;

import java.awt.*; 
import java.awt.event.*; 
import java.util.*; 
import javax.swing.*;

public class GUI02 extends JPanel 
{ 
    private final ArrayList<Point> points = new ArrayList<>();

    public GUI02() 
    { 
        addMouseMotionListener(
            new MouseMotionAdapter() 
            { 
               public void mouseDragged(MouseEvent event) 
                { 
                   points.add(event.getPoint()); 
                   repaint(); 
                } 
            } 
       ); 
} 

public void paintComponent(Graphics g) 
{ 
    super.paintComponent(g); 

    int[] xPoints = new int[points.size()];
    int[] yPoints = new int[points.size()];
    for (int i = 0; i < points.size(); i++)
    {
        xPoints[i] = points.get(i).x;
        yPoints[i] = points.get(i).y;
    }
    g.drawPolyline(xPoints, yPoints, xPoints.length);
  }
  
}