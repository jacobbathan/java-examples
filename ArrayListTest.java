import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListTest
{
	// Create blueprint for student class
	public static class Student
	{
		String firstName;
		String lastName;
		int[] grades;
		String averageGrade;
	}
	
	// Calculates all grades and returns the average as a string
	public static String calculateGrades(int[] grades)
	{
		int totalGrade = 0;
		int gradeAverage;
		
		for(int i = 0; i < grades.length; i++)
		{
			totalGrade += grades[i];
		}
		
		gradeAverage = totalGrade / grades.length;
		
		if (gradeAverage < 60)
		{
			return "F";
		}
		else if (gradeAverage < 69)
		{
			return "D";
		}
		else if (gradeAverage < 79)
		{
			return "C";
		}
		else if (gradeAverage < 89)
		{
			return "B";
		}
		else
		{
			return "A";
		}
	}
	
	// Init scanner object
	private static Scanner myScanner;

	public static void main(String[] args) 
	{
		ArrayList<Student> students = new ArrayList<Student>();
		myScanner = new Scanner(System.in);
		
		System.out.println("Enter number of students:");
		Integer numberOfStudents = Integer.parseInt(myScanner.nextLine());
		
		// Get info for all students
		for (int i = 1; i <= numberOfStudents; i++)
		{	
			int[] userGrades = new int[4];
			Student x = new Student();
			System.out.println("Enter last name of student # " + i);
			String lastName = myScanner.nextLine();
			x.lastName = lastName;
			System.out.println("Enter first name: ");
			x.firstName = myScanner.nextLine();
			
			// Insert grades
			for (int j = 0; j < 4; j++)
			{
				System.out.println("Enter grade #" + (j + 1) + " for student " + x.lastName + ", " + x.firstName + ":");
				userGrades[j] = Integer.parseInt(myScanner.nextLine());
			}
			
			x.grades = userGrades;
			x.averageGrade = calculateGrades(userGrades);
			
			students.add(x);
		}
		
		// Sorts the students in Ascending order by last name
		Collections.sort(students, new Comparator<Student>()
				{
			public int compare (Student s1, Student s2)
			{
				return s1.lastName.compareTo(s2.lastName);
			}
				});
		
		// Prints out each student with grade 
		students.forEach(student -> {
			System.out.println("Student: " + student.lastName + ", " + student.firstName + " - Final Grade : " + student.averageGrade);
		});
		
	}

}
