package Number_problems;
import java.util.*;
public class prime_rec {
	public static int prime(int n,int i) {
		if(i==1) {
			return 1;
		}
		if(n%i==0) {
			return 1+prime(n,i-1);
		}else {
			return prime(n,i-1);
		}
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("ENTER YOUR NUMBER CHECK PRIME OR NOT PRIME :");
	int num = sc.nextInt();
	System.out.println(prime(num,num));
	if(prime(num,num)==2) {
		System.out.println("PRIME NUMBER");
	}else {
		System.out.println("NOT PRIME NUMBER ");
	}
}
}
