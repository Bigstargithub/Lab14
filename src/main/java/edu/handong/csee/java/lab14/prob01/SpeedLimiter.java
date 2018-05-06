package edu.handong.csee.java.lab14.prob01; // the package, edu.handong.csee.java.lab14.prob01

/**
 * This is a public class, SpeedLimiter.
 * This class will display the caution "Speed limit exceed!" when the present speed is larger than limit speed.
 * @author Bigstar
 *
 */
public class SpeedLimiter 
{	
	private int speed = 0; // set the private integer variable, speed.
	private int limit = 0; // set the private integer variable, limit.
	/**
	 * This is a constructor.
	 * @param speed
	 * @param limit
	 */
	public SpeedLimiter(int speed, int limit)
	{
		this.speed = speed; // the this keyword. this speed points itself.
		this.limit = limit; // the this keyword. this limit points itself.
	}
	
	/**
	 * This is a public method, warnSpeedLimit.
	 * This method will perform when the speed is larger than limit speed.
	 */
	public void warnSpeedLimit()
	{
	 try // contains code where something could possibly go wrong.
	 {
	  if(this.speed > this.limit) // if speed is exceeded to limit speed.
	  {
	    throw new Exception("Speed Limit " + this.limit + "km exceeded!"); // throw the Exception this parenthesis "Speed Limit (limit value)km exceeded!"
	  }
	  System.out.println("You are a law abiding citizen!"); // if not, display the parenthesis "You are a law abiding citizen!".
	 }
	 catch (Exception e) // will perform when there are any exception.
	  {
		  System.out.println(e.getMessage()); // display the error message.
		  System.out.println("You are being fined."); // display the parenthesis "You are being fined.".
	  }
	 
	 System.out.println("Your current speed: " + this.speed); // display the current speed.
	}
	

}
