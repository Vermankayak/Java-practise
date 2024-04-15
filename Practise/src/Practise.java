interface ISampl{
	void m1();
	void m2();
}

interface ISampl1{
	void m3();
}

interface ISampl2 extends ISampl,ISampl1{}

class Demo{
	
}

public class Practise extends Demo implements ISampl2{
	
	public void m1() {};
	
	public void m2() {};
	public void m3() {};
 }
