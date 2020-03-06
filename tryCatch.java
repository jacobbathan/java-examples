import javax.swing.JOptionPane;

public class errorTest
{
    public static void main(String[] args)
    {
        try
        {
            String line = JOptionPane.showInputDialog(null, "Enter Number");
            if (line.equals ("0"))
            {
                System.exit(0);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Invalid Number");
            }
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }

    }
}