import java.util.Scanner;

public class PropertyTax {

	private static Scanner myObj;

	public static void main(String[] args) {
		
		myObj = new Scanner(System.in); // Create new scanner object
		
		System.out.println("Please enter user property value:"); // Indication for user to enter property value
		String propertyValue = myObj.nextLine(); // Stores user input into the propertyValue variable
		
		System.out.println("Please enter the tax value:"); // Prompt for user to enter tax 
		String taxRate = myObj.nextLine(); // Stores user input into the taxRate variable
		
		// Parses the strings to the double data type, multiplies then, and stores the value in the property tax variable
		double propertyTax = Double.parseDouble(propertyValue) * Double.parseDouble(taxRate);
		
		// Prints the result to the user
		System.out.println("Your property tax amount is: " + propertyTax);
	}

}
