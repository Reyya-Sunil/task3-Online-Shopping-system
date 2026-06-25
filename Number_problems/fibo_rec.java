package Number_problems;
import java.util.*;

public class fibo_rec {
	public  static int fibo(int num ) {
		if(num ==1||num ==2) {
			return 1;
		}
		return fibo(num-1)+fibo(num-2);
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("ENTER YOUR NUMBER :");
	int num = sc.nextInt();
	System.out.println("YOUR OUTPUT : "+fibo(num));
	
}
}
