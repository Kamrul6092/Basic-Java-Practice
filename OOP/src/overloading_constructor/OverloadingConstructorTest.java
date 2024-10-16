package overloading_constructor;

public class OverloadingConstructorTest {

	public static void main(String[] args) {
		Teacher teacher1=new Teacher();
		
		Teacher teacher2=new Teacher("atif","male");
		teacher2.displayInformation();
		
		Teacher teacher3=new Teacher("atif","male",1676572264);
		teacher3.displayInformation();
	}

}
