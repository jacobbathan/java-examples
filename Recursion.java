import java.util.Scanner;

public class Recursion 
{

	private static Scanner myObj;
	
	public static void main(String[] args) 
	{
		
		// Start the program, running it with an initial Y input
		userInputs("Y");
		
	}
	
	// Factorial method, will run recursively if input > 1
	public static long factorial(long n)
	{
		if (n <= 1)
		{
			return n;
		}
		else
		{
			return n * factorial(n - 1);
		}
	}
	
	public static void userInputs(String input)
	{
		if (input.equalsIgnoreCase("N"))
		{
			System.out.println("Exiting Program...");
			System.exit(0);
		} 
		else if (input.equalsIgnoreCase("Y"))
		{
			// Initialize new Scanner object
			myObj = new Scanner(System.in);
			long userInputLong;
			long factorialOutput;
			String userEndInput;
			
			System.out.println("Enter the factorial number:");
			userInputLong = Long.parseLong(myObj.nextLine());
			factorialOutput = factorial(userInputLong);
			System.out.println(userInputLong + "! is equal to: " + factorialOutput);
			System.out.println("--------------------");
			System.out.println("Would you like to run this program again? Y/N");
			userEndInput = myObj.nextLine();
			userInputs(userEndInput);
		}
		else
		{
			System.out.println("Unrecognized command, exiting program.");
			System.exit(0);
		}
	}

}
