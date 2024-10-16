package ooptest;

public class Teacher {

	String name,gender;
	int phone;
	
	/*void setInformation(String n,String m,int ph) {
	  name=n;
	  gender=m;
	  phone=ph;}	*/
	
	
	//for default constructor method//

	Teacher (){
		
		System.out.println("no value");
	}
	
	Teacher (String n,String m,int ph){
		
		  name=n;
		  gender=m;
		  phone=ph;
	
		
	}
	
	void displayInformation() {
		

		System.out.println("name: "+name);
		System.out.println("gender: "+gender);
		System.out.println("phone:  "+phone ); 
		System.out.println("\n \n" ); 
	}
}
