package edu.handong.csee.java.lab14.prob02; // the package, edu.handong.csee.java.lab14.prob02.

/**
 * This is a public class, Main. </br>
 * The class contains main method.
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
	    int x = 0; // set the integer variable, x
		int y = 0; // set the integer variable, y
		In_exception in1 = new In_exception(x,y); // instantiation the In_exception class.
		in1.error(); // call to the method (error) in the In_exception class.
	}

}
