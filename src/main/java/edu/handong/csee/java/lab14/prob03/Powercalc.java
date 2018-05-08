package edu.handong.csee.java.lab14.prob03; // the package, edu.handong.csee.java.lab14.prob03
import java.util.Scanner; // get the Scanner class from java.util package.
/**
 * This is a public class, Powerclac. </br>
 * This class has method, power.</br>
 * This method will perform calculation n to the power of p.
 * @author Bigstar
 */
public class Powercalc {

	private int n = 0; // set the private integer variable, n.
	private int p = 0; // set the private integer variable, p.
	
	/**
	 * This is a constructor.
	 * @param n
	 * @param p
	 */
	public Powercalc(int n, int p)
	{
		this.n = n; // the this keyword. the n variable points itself.
		this.p = p; // the this keyword. the p variable points itself.
	}
	
	/**
	 * This is a public method, power. </br>
	 * The method performs calculation n to the power of p.
	 * @param n
	 * @param p
	 * @return
	 */
	public long power(int n, int p)
	{
		try // contains code where something could possibly go wrong. 
		{
			Scanner keyboard = new Scanner(System.in); // prepare to read from the keyboard.
			n = keyboard.nextInt(); // input the integer variable to the n.
			p = keyboard.nextInt(); // input the integer variable to the p.
			if(n == 0 && p == 0) // if n and p is zero, 
			{
				throw new Exception("n and p should not be zero"); // make a error message "n and p should not be zero".
			}
			if(n < 0 || p < 0) // if n or p is less than 0.
			{
				throw new Exception("n or p should not be negative"); // make a error message "n or p should not be negative".
			}
			
		}
		catch(Exception e) // if n and p is zero and either n or p is negative.
		{
			System.out.println("java.lang.Exception: " + e.getMessage()); // display the error massage "java.lang.Exception: massage that catch the throwing message.
			System.exit(0); // System is done.

		}
		return (long)Math.pow(n, p); // return long type number(n to the power of p).
	}
}
