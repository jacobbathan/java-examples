import javax.swing.JOptionPane;

public class GUIPropertyTax
{
	public static void main(String[] args) 
	{
		// Declare variables to be used
	    String strNumberProperties;
	    int intNumberProperties;
	    float propertyTax;
	    float totalPropertyTax = 0;
	    float totalPropertyValue = 0;
	    
	    //Prompt users for the number of properties.
	    strNumberProperties = JOptionPane.showInputDialog("Enter the number of properties or E to exit program"); 

	    //User must press "E" to terminate the program
	    if(strNumberProperties.equalsIgnoreCase("E"))
	    {
	      System.exit(0);
	    }
	    else
	    {
	      //Prompt users for property tax  
	      propertyTax= Float.parseFloat(JOptionPane.showInputDialog("Please enter property tax (in decimal form)"));
	      
	      // Parse input of inputed number of properties into an integer type
	      intNumberProperties = Integer.parseInt(strNumberProperties);
	      
	      // Create new array of property values
	      float[] propertyValue = new float[intNumberProperties];
	      
	      // Iterate and ask user for values of individual property, add to array of propertyValue
	      for(int i = 0; i < intNumberProperties; i++)
	      {
	    	  //Prompt users to input the value for each property
	    	  propertyValue[i] = Float.parseFloat(JOptionPane.showInputDialog("Enter the value for property #" + (i + 1)));  
	      }
	      
	      // With the new array of property values, iterate through the array, calculate the property tax of each and add them together. 
	      for(int i = 0; i < intNumberProperties; i++)
	      {
	    	  totalPropertyTax = propertyValue[i] * propertyTax;  
	    	  totalPropertyValue = totalPropertyValue + propertyValue[i];
	      }

	      JOptionPane.showMessageDialog(null, "The total value of all properties is $" + totalPropertyValue + ". The total property tax owed is $" + String.format("%.2f", totalPropertyTax));
	    }
	}
}
