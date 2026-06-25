package Number_problems;
import java.util.*;

public class factorial_rec {
	public  static int fac(int num) {
		if(num==0) {
			return 1;
		}
		return (num)*fac(num-1);
		
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter your NUMBER :");
	int num =sc.nextInt();
System.out.println("Your FAC :"+fac(num));
}
}
