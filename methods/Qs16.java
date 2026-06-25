package methods;

public class Qs16 {
	public  void method1 () {
		System.out.println("Hello by using non static ");
	}
	public static void  method2(){
	System.out.println("hi by using static ");	
	}
public static void main(String[] args) {
	method2 (); // for static method
	Qs16 D1 = new Qs16 ();
	D1.method1();
			
	
	
}
}
