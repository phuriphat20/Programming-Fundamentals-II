package Homework09;

import java.util.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;



public class GUI03ChangeBlush extends JFrame
{
    //Attribute
    private JPanel panel;
    private JRadioButton rButton1 ,rButton2;
    private ButtonGroup group;
    private Point checkPoint;
    private int CheckSelect = 1 ;
    private final ArrayList<Point> points = new ArrayList<>();
    
    public GUI03ChangeBlush()
    {
        setLayout(new BorderLayout());

        rButton1 = new JRadioButton("Line",true);
        rButton2 = new JRadioButton("Dot");
        rButton1.setFocusable(false);
        rButton2.setFocusable(false);
        group = new ButtonGroup();
        group.add(rButton1);
        group.add(rButton2);
        panel.add(rButton1);
        panel.add(rButton2);
        add(panel,BorderLayout.SOUTH);
        addMouseListener(new MouseAdapter() 
        {
            public void mousePressed(MouseEvent event)
            {
                if(rButton1.isSelected())
                {
                    if(CheckSelect == 1)
                    {
                        checkPoint = event.getPoint();
                        CheckSelect--;
                    }
                }
            }
            public void mouseReleased(MouseEvent event)
            {
                if(rButton1.isSelected())
                {
                    points.add(event.getPoint());
                    repaint();
                }
            }
        });

        addMouseMotionListener(new MouseMotionAdapter() 
        {
            public void mouseDragged(MouseEvent event)
            {
                if(rButton2.isSelected())
                {
                    points.add(event.getPoint());
                    repaint();
                }
            }    
        });
    }

    public void paintComponent(Graphics g)
    {
        super.paintComponents(g);
        for(Point point : points)
        {
            if(rButton1.isSelected())
            {
            g.drawLine(checkPoint.x, checkPoint.y, point.x, point.y);
            checkPoint.x = point.x;
            checkPoint.y = point.y;
            }else
            {
                g.fillOval(point.x, point.y, 4, 4);
            }

        }
    }
}