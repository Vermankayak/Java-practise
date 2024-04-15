interface ISampl{
	void m1();
	void m2();
}

interface ISampl1{
	void m3();
}

interface ISampl2 extends ISampl,ISampl1{}

 abstract class SamplImpl implements ISampl{
	public void m1() {
		System.out.println("I am a disco dancer");
	}
}

public class Practise extends SamplImpl implements ISampl2{
	
	public void m2() {};
	public void m3() {};
 }
