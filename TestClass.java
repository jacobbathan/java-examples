import javax.swing.JOptionPane;


public class TestClass 
{


  public static void main(String[] args) 
  {

    String strNumberProperties ="";

    int intNumberProperties =0;

    double propertyTax=0.0;

    double totalPropertyTax=0.0;

    double totalPropertyValue=0.0;

    strNumberProperties = JOptionPane.showInputDialog("Enter the number of properties or E to exit program");//Prompt users for the number of properties.

    if(strNumberProperties.equalsIgnoreCase("E"))//User must press "E" to terminate the program

    {

      System.exit(0);

    }

    else

    {

      propertyTax=Double.parseDouble(JOptionPane.showInputDialog("Please enter property tax"));//Prompt users for property tax  

      intNumberProperties= Integer.parseInt(strNumberProperties);

      double[] propertyValue = new double[intNumberProperties];

      for(int i=0;i<intNumberProperties;i++)

      {

      propertyValue[i]=Double.parseDouble(JOptionPane.showInputDialog("Enter the value for property "+(i+1)));//Prompt users to input the value for each property  

      }

      for(int i=0;i<intNumberProperties;i++)//Calculate the TOTAL amount of all property tax combined

      {

      totalPropertyTax =totalPropertyTax+propertyTax;  

      totalPropertyValue=totalPropertyValue+propertyValue[i];

      }

      JOptionPane.showMessageDialog(null,"The total property value is "+(totalPropertyValue)+" and total property tax is "+(totalPropertyTax));

    }

  }

}