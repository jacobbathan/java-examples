import java.util.*;

public class Stack 
{	
	// Create Stack from an array list
	List<Integer> stack = new ArrayList<Integer>();
	
	// Remove integer from top of stack
	public int pop()
	{
		return stack.remove(stack.size() - 1);
	}
	
	// Add integer to top of stack
	public void push(int number)
	{
		stack.add(number);
	}
	
	// Prints all content of a stack
	public void displayStack()
	{
		System.out.println("Stack:");
		stack.forEach(System.out::println);
	}
	
	// Returns size of stack, needed for for loop indexing
	public int size()
	{
		return stack.size();
	}
	
	// Method to reverse the content of a stack 
	// I had trouble with this one, I could not figure out how to do it better than O(n^2) time complexity
	public static Stack reverseStack(Stack inputStack)
	{	
		// Create a temporary queue to add to a new stack
		List<Integer> tempQueue = new ArrayList<Integer>();
		// Counter for the for loop iteration
		int counter = inputStack.size();
		Stack returnedStack = new Stack();
		
		// Add items from stack into queue
		for (int i = 0; i < counter; i++)
		{
			tempQueue.add(inputStack.pop());
		}
		
		// Add items from queue into stack, in reverse of the original order
		for (int j = 0; j < tempQueue.size(); j++)
		{
			returnedStack.push(tempQueue.get(j));
		}
		
		
		// Print and return the reverse stack
		System.out.println("STACK REVERSED:");
		returnedStack.displayStack();
		return returnedStack;
	}
	
	public static void main(String[] args)
	{
		// Create new stack
		Stack initStack = new Stack();
		
		// Add values to stack, 0 will be at the bottom
		initStack.push(0);
		initStack.push(3);
		initStack.push(5);
		initStack.push(7);
		
		System.out.println("Normal Stack:");
		initStack.displayStack();
		
		initStack = reverseStack(initStack);
	}
}
