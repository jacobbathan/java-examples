import javax.swing.JOptionPane;

public class CalculateTax 
{

	public static void main(String[] args) 
	{
		// Declare variables
		String value; // Value of house
		String taxRate; // Percentage of tax
		String totalDue; // Product of value and taxRate
		
		// First user input, get value of house
		value = JOptionPane.showInputDialog("Please enter value of your house.");
		
		// Second user input, get tax rate
		taxRate = JOptionPane.showInputDialog("Please enter the tax rate (in decimal form)");
		
		// Parse inputs into floats, then calculate amount of taxes due
		totalDue = taxesDue(Float.parseFloat(value), Float.parseFloat(taxRate));
		
		// Print result to user
		JOptionPane.showMessageDialog(null, "The total amount of property tax owed is: $" + totalDue);

	}

	// Method to calculate taxes, returns product of the two inputed after parsing decimal
	public static String taxesDue(float value, float taxRate)
	{
		float totalDue = value * taxRate;
		
		return String.format("%.2f",totalDue);
	}

}
