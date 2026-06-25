package Number_problems;
import java.util.*;
public class prime_num_recrusion {
	public static boolean check(int i,int n) {
		if(i<n) {
			if(n%i==0) {
				return false;
			}else {
				return check(i+1,n);
			}
			
		}
		return true;
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("ENTER YOUR NUMBER :");
	int in =sc.nextInt();
	int n =2;
	System.out.println(check(in,n));
}
}
