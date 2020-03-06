import java.util.Scanner;

public class TaxCalculator {

	private static Scanner myObj;
	
	public static void main(String[] args) {
		
		// Create new scanner object 
		myObj = new Scanner(System.in);
		
		// Asks user for total taxable income
		System.out.println("What is your total taxable income?");
		
		// Gets user input, stores in taxableIncome variable, parses input as a double
		double taxableIncome = Double.parseDouble(myObj.nextLine());
		
		// Conditional check for income tax, going from lowest to highest
		
		if (taxableIncome <= 8500)
		{	
			// create locally scoped tax value, print value to user
			double tax = .10;
			double taxOwed = tax * taxableIncome;
			System.out.print("Your total tax owed is: " + taxOwed);
		}
		else if (taxableIncome <= 34500)
		{
			double tax = .15;
			double taxOwed = tax * taxableIncome;
			System.out.println("Your total tax owed is: " + taxOwed);
		}
		else if (taxableIncome <=83600)
		{
			double tax = .25;
			double taxOwed = tax * taxableIncome;
			System.out.println("Your total tax owed is: " + taxOwed);
		}
		else if (taxableIncome <=174400)
		{
			double tax = .28;
			double taxOwed = tax * taxableIncome;
			System.out.println("Your total tax owed is: " + taxOwed);
		}
		else if (taxableIncome <= 379150)
		{
			double tax = .33;
			double taxOwed = tax * taxableIncome;
			System.out.println("Your total tax owed is: " + taxOwed);
		}
		else // Highest possible tax bracket, if income is above $379,150
		{
			double tax = .35;
			double taxOwed = tax * taxableIncome;
			System.out.println("Your total tax owed is: " + taxOwed);
		}
	}

}
