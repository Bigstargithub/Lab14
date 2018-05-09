package edu.handong.csee.java.lab14.prob05; // the package, edu.handong.csee.java.lab14.prob05.
import java.util.Scanner; // get the Scanner class from java.util package.

/**
 * This is a public class, Main. </br>
 * This class has a main method and public static method, mytest. </br>
 * @author Bigstar
 *
 */
public class Main {

	/**
	 * This is a main method.
	 * @param args
	 */
	public static void main(String[] args)
	{
		try // performs until the error occurs.
		{
			Scanner keyboard = new Scanner(System.in); // prepares to read from the keyboard.
			String s1 = keyboard.nextLine(); // input the String variable.
			Main.myTest(s1); // call to myTest method in the Main class.
			
		}
		catch(MyException e) // if error occurs, catch the thrown thing.
		{
			System.out.print("Inside catch block: " + e); // display the error "Inside catch block: " and catch exception.
		}
		
	}
	
	/**
	 * This is a public static method, myTest. </br>
	 * This method throws exception if string is null.
	 * @param str
	 * @throws MyException
	 */
	public static void myTest(String str) throws MyException
	{
		if(str.equals("null")) // if String variable is null
		{
			throw new MyException("String val is null"); // throw exception message "String val is null".
		}
		else // if String variable is not null.
		{
			System.out.println("String val is " + str); // display the parenthesis "Stirng val is " and String variable.
		}
	}
}
