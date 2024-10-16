package javanewjourny;

import java.util.Scanner;

public class journy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner (System.in);
		
		double base,height,area;
		
		System.out.print("enter traingle base = ");
		base=input.nextDouble(); 
				
		
		System.out.print("enter traingle height = ");
		height=input.nextDouble();
		
		
		area=0.5*base*height;
		System.out.print("area of traingle = " +area);
		
		
		
		
		/*String name; 
		
		System.out.println("enter any name");
		name=input.nextLine();
		
		System.out.println("hello vaaia name is ="+name);*/
		

		
	}

}
