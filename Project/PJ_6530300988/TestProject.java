package PJ_6530300988;

public class TestProject 
{
    public static void main(String[] args) 
    {
        javax.swing.SwingUtilities.invokeLater(new Runnable()
        {
            @Override
            public void run() 
            {
                new CreateMainGUI();
            }
        });
    }
}