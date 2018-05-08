package edu.handong.csee.java.lab14.prob03;// the package, edu.handong.csee.java.lab14.prob03
/**
 * This is a public class, Main.</br>
 * This class has main method.
 * @author Bigstar
 *
 */
public class Main 
{
	/**
	 * This is a main method.
	 * @param args
	 */
   public static void main(String[] args)
   {
	   int n = 0; // set the integer variable, n.
	   int p = 0; // set the integer variable, p.
	   
	   Powercalc p1 = new Powercalc(n,p); // instantiation of Powercalc class.
	   System.out.println(p1.power(n, p)); // display the return of power method in the Powercalc class.
   }
}
