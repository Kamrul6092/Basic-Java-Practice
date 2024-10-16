package javanewjourny;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner (System.in);
		
		char ch;
		System.out.println("enter number = ");
		
		ch =input.next().charAt(0);
		
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
			System.out.println("vowel"); 
		
		}
		
		else if(ch=='A'|ch=='E'||ch=='I'||ch=='O'||ch=='U')
			
		{System.out.println("Vowel");
		
		
		}
		
		
		else 
		{System.out.println("constant");
		
		
		}
		
		
		
		
		
		
		
		
		

	}

}
