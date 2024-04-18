import java.util.ArrayList;

class Student{
	void disp(){
		
	}
}

//class Child extends Parent{
//	void disp() throws ArithmeticException {
//		
//	}
//}


public class Practise  {
	static int [] a;
	
	public static void main(String... args) {
		
		ArrayList al = new ArrayList();
		
		al.add(new Student());
		
		Object o = al.get(0);
		
		System.out.println(o instanceof Student);
		
	
		
		
	}
	
 }
