package edu.handong.csee.java.lab14.prob01; // the package, edu.handong.csee.java.lab14.prob01
import java.util.Scanner; //get the Scanner class from the package java.util.
import java.util.Random; // get the Random class from the package, java.util.

/**
 * This is a public class, Main. </br>
 * This class will perform the main method.
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
		int limit = 0; // set the integer variable, limit.
		int speed = 0; // set the integer variable, speed.
		Scanner keyboard = new Scanner(System.in); // Prepares to read from the keyboard.
		Random ran = new Random(); // prepares to get to the random number.
		
		System.out.printf("Set the speed limit, officer: "); // ask you to set the speed limit.
		limit = keyboard.nextInt(); // input the speed limit
		speed = ran.nextInt(101); // the current speed is random number(0-100)
		
		SpeedLimiter s1 = new SpeedLimiter(speed,limit); // instantiation the SpeedLimiter class.
		s1.warnSpeedLimit(); // call to the method(warnSpeedLimit) of the SpeedLimiter class.
	}
}
