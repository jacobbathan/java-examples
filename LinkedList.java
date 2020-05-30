import java.util.*;

public class LinkedList 
{
	// Initialization of the linked list class
	static class Node  
	{ 
	    int data; 
	    Node next; 
	}
	
	static Node root;  
	
	// Inserts value to end of linked list
	static Node insert(Node root, int item) 
	{ 
	    Node temp = new Node(); 
	    temp.data = item; 
	    temp.next = root; 
	    root = temp; 
	    return root; 
	} 
	
	// method to display all values within a linked list
	static void display(Node root) 
	{ 
	    while (root != null)  
	    { 
	        System.out.print(root.data + " "); 
	        root = root.next; 
	    } 
	} 
	
	// Changes array to linked list
	static Node arrayToList(int arr[], int n) 
	{ 
	    root = null; 
	    for (int i = n - 1; i >= 0 ; i--) 
	        root = insert(root, arr[i]); 
	    return root; 
	}
	
	// Iterates through each node of the linked list, returns the value of lowest node
	static int lowestInList(Node root)
	{
		int lowestNum = root.data;
		while (root != null)
		{
			if (root.data < lowestNum)
			{
				lowestNum = root.data;
			}
			root = root.next;
		}
		return lowestNum;
	}
	  
	public static void main(String[] args) 
	{
		
		Random random = new Random();
		int[] newArray = new int[6];
		for (int i = 0; i <= 5; i++)
		{
			newArray[i] = random.nextInt(50) + 1;
		}
		
		Node linkedList = arrayToList(newArray, newArray.length);
		
		display(linkedList);
		System.out.println("");
		System.out.println("--------------------");
		System.out.println(lowestInList(linkedList));
		
	}
}
