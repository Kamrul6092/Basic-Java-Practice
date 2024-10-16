package javanewjourny;

import java.util.Scanner;

public class DegreeCalcalation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner input = new Scanner (System.in);
		
		double far,cels;
		 
		System.out.print("enter cels = "); 
		
		cels = input.nextDouble();
		
		far= 1.8 * cels + 32;
		
		System.out.println("farenhite is  = " + far);

	}

}
