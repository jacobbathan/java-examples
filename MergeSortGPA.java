import java.util.Arrays;

public class MergeSortGPA 
{
	// Main method for merge sort
	public static double[] mergeSort(double[] array)
	{
		// edge case: if empty array is the input, return it as it is technically already sorted
		if (array.length <= 1)
		{
			return array;
		}
		
		// Set pointer at middle of array
		// Partition the arrays into two halfs of equal lengths
		int middleIndex = array.length / 2;
		double[] leftHalf = Arrays.copyOfRange(array, 0, middleIndex);
		double[] rightHalf = Arrays.copyOfRange(array, middleIndex, array.length);
		
		// Return sorted array recursively
		return mergeSortedArrays(mergeSort(leftHalf), mergeSort(rightHalf));
	}
	
	// Helper method to merge the sorted arrays
	public static double[] mergeSortedArrays(double[] leftHalf, double[] rightHalf)
	{
		// Initialize new array the size of the 2 input arrays combined
		double[] sortedArray = new double[leftHalf.length + rightHalf.length];
		
		// Initialize the pointers we need
		int k = 0;
		int i = 0;
		int j = 0;
		
		// With the two pointers, iterate through the halves of the arrays, and insert them into the sortedArray in ascending order
		while (i < leftHalf.length && j < rightHalf.length)
		{
			if (leftHalf[i] <= rightHalf[j])
			{
				sortedArray[k++] = leftHalf[i++];
			}
			else
			{
				sortedArray[k++] = rightHalf[j++];
			}
		}
		
		// After the left or right array has been iterated through, complete the rest of the other array
		while (i < leftHalf.length)
		{
			sortedArray[k++] = leftHalf[i++];
		}
		while (j < rightHalf.length)
		{
			sortedArray[k++] = rightHalf[j++];
		}
		
		return sortedArray;
	}
	

	public static void main(String[] args) 
	{
		// Initialize two arrays, the unsorted array of grades, and an empty array for the sorted array to be inserted into
		double grades[] = { 3.92, 0.32, 2.49, 2.85, 2.19, 1.97, 3.13, 1.1, 0.51, 0.22, 1.04, 1.53, 3.26, 2.24, 3.48, 0.6, 0.81, 3.98, 3.51, 0.62 };
		double sortedGrades[];
		
		// Sort the grades and store value in sortedGrades
		sortedGrades = mergeSort(grades);
		
		System.out.println("----- Unsorted Grades -----");
		System.out.println(Arrays.toString(grades));
		System.out.println("----- Sorted Grades ------");
		System.out.println(Arrays.toString(sortedGrades));
	}

}
