package edu.handong.csee.java.lab14.prob04; // the package, edu.handong.csee.java.lab14.prob04.
import java.util.Scanner; // get the Scanner class from java.util package.
/**
 * This is a public method, Main.</br>
 * This class has a main method.
 * @author Bigstar
 *
 */
public class Main {

	/**
	 * This method is a main method.
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in); // prepares to read from the keyboard.
		int[] ary1 = new int[5]; // set the integer array that has a length of 5, ary1.
		boolean b = true; // set the boolean variable, b which value is true.
		int num = 0; // set the integer variable, num.
		Boundary d1 = new Boundary(ary1); // instantiation of Boundary class.
		
		while(b) // if b is true, the loop continue.
		{
			try // contains code where something could possibly go wrong.
			{
				System.out.print("Enter an integer: "); // display the parenthesis "Enter an integer: ".
				num = keyboard.nextInt(); // input the integer type number.
				d1.ExceedBoundary(num); // call to the method ExceedBoundary in the class (Boundary).
			}
			catch(ArrayIndexOutOfBoundsException e) // If it is exceeded the length of ary1. 
			{
				System.out.println("Invalid array index access!"); // display error message "Invalid array index access!"
				b = false; // change the b value, false.
			}
		}
	}
}
