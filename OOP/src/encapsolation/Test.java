package encapsolation;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person_encapsulation p1=new Person_encapsulation();
		
		//p1.name="atif";
		
		p1.setName("atif");
		p1.setAge(22);
		p1.setGander("male");
		
		System.out.println(p1.getName());
		
		System.out.println(p1.getAge());	
		System.out.println(p1.getGander());	
		
		//p1.age=30;
		//p1.display();
	}

}
