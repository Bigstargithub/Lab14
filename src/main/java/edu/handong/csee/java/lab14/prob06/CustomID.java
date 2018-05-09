package edu.handong.csee.java.lab14.prob06; // the package, edu.handong.csee.java.lab14.prob06.

/**
 * This is a public class, CustomID. </br>
 * This class is subclass of exception class. </br>
 * This class receives name, age and race.
 * @author Bigstar
 *
 */
public class CustomID extends Exception
{
	
	private String name = ""; // set the private String variable, name.
	private int age = 0; // set the private integer variable, age.
	private String[] races = new String[] {"Vulcans", "Romulan", "Klingons"}; // set the String type array, races 
	private String race = ""; // set the String variable, race.
	private int a = 0; // set the integer variable, a.

	/**
	 * This is a public method, get_name.</br>
	 * This method will throw error when a length of name is less than 5 letter.
	 * @param name
	 * @throws Exception
	 */
	public void get_name(String name) throws Exception
	{
			if(name.length() < 5) // if a length of name is less than 5 letters
			{
				throw new Exception("Your name is short! Try again"); //throw the error "Your name is short! Try again" 
			}
			
			else // if a length of name is not less than 5 letters.
			{
				this.name = name; // the this keyword. the name variable points itself.
				System.out.println("Name is valid"); // display the parenthesis "Name is valid"
				System.out.println("Name: " + name); // display the name.
				a++; // increase 1 of a.
			}
	}
	
	/**
	 * This is a public method, get_age. </br>
	 * This method will throw error when age is less than 18.
	 * @param age
	 * @throws Exception
	 */
	public void get_age(int age) throws Exception
	{
		if(age < 18) // If age is less than 18
		{
			throw new Exception("You are too young! Try again"); //throw the error message "You are too young! Try again".
		}
		
		else // If age is not less than 18
		{
			this.age = age; // the this keyword. the age variable points itself.
			System.out.println("Age is valid"); // display the parenthesis "Age is valid"
			System.out.println("Age: " + age); // display the age variable.
			a++;
		}
	}
	
	/**
	 * This is a public method, get_race.</br>
	 * This method will throw error when the array value (races) is not equal to the race variable.
	 * @param race
	 * @throws Exception
	 */
	public void get_race(String race) throws Exception
	{
		for(int i = 0 ; i < races.length ; i++) // from 0 to (race.length -1)
		{
			if(races[i].equals(race)) // if races[i] value is equal to race variable,
			{
				this.races[i] = races[i]; // the this keyword. the races[i] points itself.
				System.out.println("Race is valid"); // display the parenthesis "Race is valid"
				System.out.println("Race: " + races[i]); // display the race.
				a = 0; // set a variable to 0
				return; // end the method.
			}
			
		}
		throw new Exception("Human! Try again"); // throw the error message "Human! Try again".
	}
	
	/**
	 * This is a public method, geta. </br>
	 * This method returns a variable.
	 * @return
	 */
	public int geta()
	{
		return a; // return a variable.
	}
}