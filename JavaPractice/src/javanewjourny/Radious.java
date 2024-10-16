/**
 * 
 */
package javanewjourny;

import java.util.Scanner;

/**
 * @author islam
 *
 */
public class Radious {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner input = new Scanner(System.in);
		double radious,area; 
		
		System.out.print("enter a radious = ");
		
		radious = input.nextDouble(); 
		
		area=3.1416*radious*radious;
		
		System.out.println("radious of area is = "+area);
		
		

	}

}
