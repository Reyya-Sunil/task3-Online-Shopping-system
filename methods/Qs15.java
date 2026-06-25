package methods;

public class Qs15 {
	public static int fac_value(int a) {
		int fac=1;
	
		for(int i =1;i<=a;i++) {
			 fac *=i;
	
		}
		System.out.println("Factorial :"+fac);
		return fac;
		
			
		
	}
public static void main(String[] arg) {
	fac_value(3);
}
}
