package Number_problems;
import java.util.*;
public class happy_number {
	public static String  happy(int n) {
		while(n!=1 && n != 4) {
			int sum = 0;
			while(n !=0) {
				int d = n%10;
				sum += d*d;
				n /= 10;
			}
			n= sum;
		}
		return n ==1 ? "happy number ":"Not happy Number";
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int  d = sc.nextInt();
	
	System.out.println(happy(d));
}
}
