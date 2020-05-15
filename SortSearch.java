import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;

public class SortSearch 
{
	
	// Creates new array of unsorted integers
	public static ArrayList<Integer> generateNewArray(int n)
	{
		ArrayList<Integer> list = new ArrayList<Integer>(n);
		
		Random random = new Random();
		
		for (int i = 0; i < n; i++)
		{
			list.add(random.nextInt(20));
		}
		Collections.sort(list);
		return list;
	}

	// Binary Search method, gets index of target in O (log n) time
	public static String binarySearch(ArrayList<Integer> list, int target)
	{
		String result = binarySearch(list, target, 0, list.size());
		return result;
	}
	
	// Helper function for binary search algorithm, with counter
	public static String binarySearch(ArrayList<Integer> list, int target, int leftPointer, int rightPointer)
	{
		int counter = 1;
		while (leftPointer <= rightPointer)
		{
			int middle = (leftPointer + rightPointer) / 2;
			int potentialMatch = list.indexOf(middle);
			
			if (target == potentialMatch)
			{
				return "Found " + target + " at index " + list.indexOf(potentialMatch) + " after " + counter + " iterations";
			}
			else if (target < potentialMatch)
			{
				rightPointer = middle - 1;
			}
			else
			{
				leftPointer = middle + 1;
			}
			counter++;
		}
		return "Result not found";
	}
	
	// Linear search algorithm, iterates through the array in O(n) time
	public static String linearSearch(ArrayList<Integer> list, int target)
	{
		int counter = 1;
		
		for (int i = 0; i < list.size(); i++)
		{
			if (list.get(i) == target)
			{
				return "Found " + target + " at index " + i + " after " + counter + " iterations";
			}
			counter++;
		}
		return "Target not found";
	}
	
	public static void main(String[] args)
	{
		ArrayList<Integer> newList;
		newList = generateNewArray(20);
		Random random = new Random();
		int target = random.nextInt(20);
		
		System.out.println(newList);
		System.out.println(target);
		System.out.println("----- Linear Search -----");
		System.out.println(linearSearch(newList, target));
		System.out.println("----- Binary Search -----");
		System.out.println(binarySearch(newList, target));
	}
}
