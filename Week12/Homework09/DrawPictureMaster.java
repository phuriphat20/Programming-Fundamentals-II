package Homework09;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class DrawPictureMaster extends JPanel
{    
    private final ArrayList<Point> points = new ArrayList<>();
    private final ArrayList<Integer> log = new ArrayList<>();
    private Boolean checkDot = false;
    private Boolean checkLine = false;
    private int count = 0;
    private int temp = 0; //false = 0 , true = 1

    public DrawPictureMaster()
    {
        addMouseMotionListener(new MouseMotionAdapter()
        {
            @Override
            public void mouseDragged(MouseEvent e)
            {
                if(checkDot == true)
                {
                    points.add(e.getPoint());
                    log.add(1);
                    count++;
                    repaint();
                    System.out.println(count);
                    System.out.println(points.size());
                }
                
                if(checkLine == true)
                {
                    if(temp == 1)
                    {
                        points.add(e.getPoint());
                        temp = 0;
                        log.add(0);
                        System.out.println(count);
                        System.out.println(points.size());
                        repaint();
                    }
                    points.set(count,e.getPoint());
                    log.set(count,0);
                    System.out.printf("Set %d and count %d",points.size(),count);
                    repaint();
                }
            }
        });

        addMouseListener(new MouseAdapter()
        {
            @Override
            public void mousePressed(MouseEvent e)
            {
                if(checkLine == true)
                {
                    points.add(e.getPoint());
                    log.add(0);
                    temp = 1;
                    count++;
                    System.out.println("Pressed");
                }
            }

            @Override
            public void mouseReleased(MouseEvent e)
            {
                if(checkLine == true)
                {
                    count++;
                    System.out.println("Released");
                }
            }
        });
    }

    public void setCheckDot(Boolean checkDot)
    {
        this.checkDot = checkDot;
    }

    public void setCheckLine(Boolean checkLine)
    {
        this.checkLine = checkLine;
    }

    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        
        for(int i = 1;i < points.size();i++)
        {
            if(log.get(i) == 1)
            {
                g.fillOval((int)points.get(i).getX(),(int)points.get(i).getY(),4,4);
            }

            if(log.get(i) == 0)
            {
                if(log.get(i - 1) == 1)
                {
                    i++;
                }
                g.drawLine((int)points.get(i - 1).getX(),(int)points.get(i - 1).getY(),(int)points.get(i).getX(),(int)points.get(i).getY());
                i++;
            }
        }
    }

    public static void main(String[] args)
    {
        JFrame frame = new JFrame("DrawPictureMaster");
        DrawPictureMaster drawPictureMaster = new DrawPictureMaster();
        frame.add(drawPictureMaster,BorderLayout.CENTER);
        
        JPanel button = new JPanel();
        button.setLayout(new FlowLayout());
        JRadioButton dotButton = new JRadioButton("DOT");
        dotButton.addItemListener(new ItemListener()
        {
            @Override
            public void itemStateChanged(ItemEvent e)
            {
                if(e.getStateChange() == ItemEvent.SELECTED)
                {
                    drawPictureMaster.setCheckDot(true);
                    drawPictureMaster.setCheckLine(false);
                }
            }
        });
        button.add(dotButton);

        JRadioButton lineButton = new JRadioButton("LINE");
        lineButton.addItemListener(new ItemListener()
        {
            @Override
            public void itemStateChanged(ItemEvent e)
            {
                if(e.getStateChange() == ItemEvent.SELECTED)
                {
                    drawPictureMaster.setCheckLine(true);
                    drawPictureMaster.setCheckDot(false);
                }
            }
        });
        button.add(lineButton);

        ButtonGroup group = new ButtonGroup();
        group.add(lineButton);
        group.add(dotButton);

        frame.add(button,BorderLayout.SOUTH);

        frame.setSize(500,500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}