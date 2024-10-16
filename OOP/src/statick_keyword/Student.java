package statick_keyword;

public class Student {
	
	String name;
	int id;
	static String university="du";
	
	
	Student (String n,int i){
		
		name= n;
		id=i;
		
	}
	
void displayInformation() {
		

		System.out.println("name: "+name);
		System.out.println("id: "+id);
		System.out.println("uv name : "+university ); 
		System.out.println("\n \n" ); 
	}
	

}
