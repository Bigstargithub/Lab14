package edu.handong.csee.java.lab14.prob06; // the package, edu.handong.csee.java.lab14.prob06
import java.util.Scanner; // get the Scanner class from java.util package.

/**
 * This is a public class, Main. </br>
 * This class has a main method.
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
		String name = ""; // set the String variable ,name.
		int age = 0; // set the integer variable, age.
		String race = ""; // set the String variable, race.
		boolean a = true; // set the boolean type variable, a.
		
		Scanner keyboard = new Scanner(System.in); // prepares to read from the keyboard.
		CustomID ci = new CustomID(); // instantiation of CustomID class
		
		while(a) // When a value is true, the loop is continue.
		{
			try // performs until the error occurs.
			{
				if(ci.geta() == 0) // if return of geta method is 0
				{
					System.out.print("Enter your name: "); // display the parenthesis "Enter your name: ".
					name = keyboard.nextLine(); // input name variable.
					ci.get_name(name); // call to the get_name method in the CustomID class.
				}
				
				if(ci.geta() == 1) // if return of geta method is 1
				{
					System.out.print("Enter your age: "); // display the parenthesis "Enter your age: "
					age = keyboard.nextInt(); // input age variable.
					ci.get_age(age); // call to the get_age method in the CustomID class.
				}
				
				if(ci.geta() == 2) // if return of geta method is 2
				{
					System.out.print("Enter your race: "); // display the parenthesis "Enter your race: ". 
					race = keyboard.nextLine(); // input race variable.
					ci.get_race(race); // call to the get_race method in the CustomID class.
				}
			}
			catch(Exception e) // if the error occurs, catch the thrown thing.
			{
				System.out.println(e.getMessage()); // display the error message.
				continue; // a loop continues.
			}
		}
		
	}
}
