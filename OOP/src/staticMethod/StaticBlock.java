package staticMethod;

public class StaticBlock {
	
	
	
	
	static int id;
	static String name;
	
	
	static {
		
		id=101;
		name="kamrul";
		
	}
	
	static void display() {
		
		System.out.println(id);
		System.out.println(name);
	}
	
}
