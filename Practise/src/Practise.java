class Computer{
	
	public void config() {
		System.out.println("Configured your old computer");
	}
	
}
public class Practise{

	public static void main(String [] args) {
		
		Computer comp  = new Computer() {
			public void config() {
				System.out.println("Configured your computer");
			}
		};
		
		comp.config();
		
	}
}
