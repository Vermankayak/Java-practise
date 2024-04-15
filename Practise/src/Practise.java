abstract class Computer{
	
	abstract public void disp();
	
	public void config() {
		System.out.println("Configured your old computer");
	}
	
}
public class Practise extends Computer{
	
	public void disp() {
		System.out.println("Dsiplaying features");
	}

	public static void main(String [] args) {
		
		Practise prac = new Practise();
		
		
		prac.disp();
		
		
	}
}
