package edu.handong.csee.java.lab14.prob02; // the package, edu.handong.csee.java.lab14.prob02.
import java.util.InputMismatchException; // get the InputMismatchException class from the package java.util.
import java.util.Scanner; // get the Scanner class from the package java.util.

/**
 * This is a public class, In_exception. </br>
 * The class will perform the division.
 * @author Bigstar
 *
 */
public class In_exception {

	private int x = 0; // set the private integer, x
	private int y = 0; // set the private integer, y
	
	/**
	 * This is a constructor.
	 * @param x
	 * @param y
	 */
	public In_exception(int x, int y)
	{
		this.x = x; // the this keyword. the x variable points itself.
		this.y = y; // the this keyword. the y variable points itself.
	}
	
	/**
	 * This is a public method, error. </br>
	 * This method will perform division. </br>
	 * When x and y are not 32-bit signed integer or if y is zero, the error will occur.
	 */
	public void error()
	{
		try // contains code where something could possibly go wrong.
		{
		   Scanner keyboard = new Scanner(System.in); // Prepares to read from the keyboard.
		   System.out.printf("x: "); // ask what is x value.
		   x = keyboard.nextInt(); // input the x variable.
		   System.out.printf("y: "); // ask what is y value.
		   y = keyboard.nextInt(); // input the y value.
		   System.out.println(this.x/this.y); // display the result of division.
		}
		
		catch(InputMismatchException i) // when x and y are not 32-bit signed integer.
		{
			System.out.println("java.util.InputMismatchException"); // display the parenthesis "java.util.InputMismatchException".
		}
		
		catch(ArithmeticException a) // when y is zero.
		{
			System.out.println("java.lang.ArithmeticException"); // display the parenthesis "java.util.ArithmeticException".
		}
		
		catch(Exception e) // if the method contacts any error.
		{
			System.out.println("you are wrong that is " + e.getMessage()); // display what's error.
		}
		
	}

}
