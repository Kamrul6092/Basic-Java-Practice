package problem_solve;

public class Box {

	double height,width,depth;
	
	
	Box (double h, double  w,double d){
		
		height=h;
		width=w;
		depth= d;
		
		
		
	}
	
	void displyvol() {
		
	
		double vol= height*width*depth;
		
		System.out.println(vol);
	}
	
}
