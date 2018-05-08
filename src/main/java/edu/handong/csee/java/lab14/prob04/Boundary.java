package edu.handong.csee.java.lab14.prob04; // the package, edu.handong.csee.java.lab14.prob04.

/**
 * This is a public class, Boundary. </br>
 * This class has an integer array with a length of 5.</br>
 * And, The class repeatedly receive inputs of integer until the error occurs (ArrayIndexOutOfBoundsException)
 * @author Bigstar
 *
 */
public class Boundary {
	
	int[] ary1 = new int[5]; // set the integer array with a length of 5 (ary1)
	int i = 0; // set the integer variable, i.
	
	/**
	 * This is a constructor.
	 * @param ary1
	 */
	public Boundary(int[] ary1)
	{
		this.ary1 = ary1; // the this keyword. the integer type array points itself.
	}

	/**
	 * This is a public method, ExceedBoundary. </br>
	 * This method throws error when i exceeds a length of array.
	 * @param num
	 * @throws ArrayIndexOutOfBoundsException
	 */
	public void ExceedBoundary(int num) throws ArrayIndexOutOfBoundsException
	{
		ary1[i] = num; // index i of ary1 value is num variable value.
		System.out.println("arr[" + i + "] <- " + num); // display the parenthesis and num variable value
		i++; // increase 1 of i.
	}
}
