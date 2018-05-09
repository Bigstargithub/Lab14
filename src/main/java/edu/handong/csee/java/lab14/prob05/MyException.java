package edu.handong.csee.java.lab14.prob05; // the package, edu.handong.csee.java.lab14.prob05

/**
 * This is a public class, MyException.</br>
 * The class is a subclass of Exception class.
 * @author Bigstar
 *
 */
public class MyException extends Exception {
	
	private String name = null; // set the private String variable, name.
	
	/**
	 * This is a constructor of a MyException class that don't have any parameter.
	 */
	public MyException()
	{
		super(); // call to super class.
	}
	
	/**
	 * This is a constructor of a MyException class that has parameter.
	 * @param name
	 */
	public MyException(String name)
	{
		super(name); // call to super class with a parameter (name)
		this.name = name; // the this keyword. the name variable points itself.
	}
	
	/**
	 * This is a constructor of a MyException class that has parameter.
	 * @param cause
	 */
	public MyException(Throwable cause)
	{
		super(cause); // call to super class with a parameter (cause)
	}
	
	/**
	 * This is a public method, toString. </br>
	 * This method returns String type.
	 */
	public String toString()
	{
		return name; // return String variable, name.
	}

}
