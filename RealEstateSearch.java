import java.util.Scanner;

public class RealEstateSearch
{
	private static Scanner scanner;

	public static String binarySearch(int[] array, int target)
	{
		return binarySearch(array, target, 0, array.length - 1);
	}
	
	public static String binarySearch(int[] array, int target, int leftPointer, int rightPointer)
	{
		int startYear = 1970;
		
		while (leftPointer <= rightPointer)
		{
			int middle = (leftPointer + rightPointer) / 2;
			int potentialMatch = array[middle];
			if (target == potentialMatch)
			{
				return "Found $" + target + " at year " + (startYear + middle);
			}
			else if (target < potentialMatch)
			{
				rightPointer = middle - 1;
			}
			else
			{
				leftPointer = middle + 1;
			}
		}
		return "The closest amount to target was " + array[rightPointer] + " at year " + (startYear + rightPointer);
	}
	
	public static void main(String[] args)
	{
		scanner = new Scanner(System.in);
		
		int[] houseValues = {24640, 25000, 30000, 33500, 36600, 41600, 50010, 70000,
		81200, 99550, 100000, 101000, 103000, 109010, 119860, 134240, 150010, 162000,
		173500, 183770, 190000, 195000, 198000, 210010, 220160};
		
		try
		{
			System.out.print("Enter the target number: ");
			int targetInput = Integer.parseInt(scanner.nextLine());
			
			String result = binarySearch(houseValues, targetInput);
			System.out.println(result);
		}
		catch(NumberFormatException error)
		{
			System.out.println("Incorrect data type, please enter a number.");
		}
	}
}
