package Number_problems;
import java.util.*;
public class PrintAllPrime {
	public static  boolean PrintAll(int n ) {
		int count =0;
		for(int i =1;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		return count ==2;
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("ENTER NUMBER TO PRINT PRIMAE NUMBER RANGE : ");
	int n = sc.nextInt();
	for(int i =1;i<=n;i++) {
		if(PrintAll(i)) {
			System.out.println(i);
		}
	}
}
}
