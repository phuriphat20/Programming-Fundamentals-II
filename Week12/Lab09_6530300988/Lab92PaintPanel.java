package Lab09_6530300988;

import java.awt.*; 
import java.awt.event.*; 
import java.util.*; 
import javax.swing.*;

public class Lab92PaintPanel extends JPanel 
{ 
    private final ArrayList<Point> points = new ArrayList<>();

    public Lab92PaintPanel() 
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

    for(Point point : points)
        g.fillOval(point.x, point.y, 4, 4); 
   }
}