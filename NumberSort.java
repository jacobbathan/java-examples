import java.util.Arrays;
import javax.swing.JOptionPane;

public class NumberSort 
{

	public static void main(String[] args) 
	{
		// Declare variables to be used
		String strNumbersToBeSorted;
		int intNumbersToBeSorted;
		strNumbersToBeSorted = JOptionPane.showInputDialog("Enter the number of integers you wish to sort. Type E to exit the program.");
		
		// If E is typed, terminate program
		if(strNumbersToBeSorted.equalsIgnoreCase("E"))
		{
			System.exit(0);
		}
		else
		{
			// Parse input of integers to be sorted into an integer type
			intNumbersToBeSorted = Integer.parseInt(strNumbersToBeSorted);
			
			// Create new array of integer values
			int[] integerArray = new int[intNumbersToBeSorted];
			
			// Iterate and ask user for integers to be sorted and append to integerArray
			for (int i = 0; i < intNumbersToBeSorted; i++)
			{
				integerArray[i] = Integer.parseInt(JOptionPane.showInputDialog("Enter the integer for item #" + (i + 1)));
			}
			
			// With unsorted array, sort using bubble sort
			int[] sortedArray = bubbleSort(integerArray);
			// Print result to user
			JOptionPane.showMessageDialog(null, "Your array sorted in descending order is: " + Arrays.toString(sortedArray));
		}

	}
	
	// Define bubble sort algorithm
	public static int[] bubbleSort(int[] array)
	{
		if (array.length == 0) 
		{	
			return new int[] {};
		}
		
		// Create boolean to determine if bubble sort needs to continue
		boolean isSorted = false;
		int counter = 0;
		while (!isSorted)
		{	
			// Change sorted boolean to true
			isSorted = true;
			// Loop through the array, if index is greater than the next index in the array
			for (int i = 0; i < array.length - 1 - counter; i++)
			{	
				// If array needs to be swapped, swap indices and set isSorted to false, returning to start of function
				if (array[i] < array[i+1])
				{
					swap(i, i+1, array);
					isSorted = false;
				}
			}
			counter++;
		}
		return array;
	}
	
	// Helper function to handle the swap of the sorted integers
	public static void swap(int i, int j, int[] array)
	{
		int temp = array[j];
		array[j] = array[i];
		array[i] = temp;
	}

}
