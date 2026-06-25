package Number_problems;

import java.util.*;
public class fac_for {
	public static int fac(int num ) {
		int fact =1;
		for(int i =1;i<=num;i++) {
			fact*=i;
		}
		return fact;
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("ENTER YOUR NUMBER :");
	int num = sc.nextInt();
	
	System.out.println("YOUR FACT : "+fac(num));
	
}
}
