package Number_problems;
import java.util.*;
public class Perfect_Num {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("ENTER YOUR NUMBER TO KNOW PERFECT NUM");
	int n = sc.nextInt();
	int sum = 0;
	for(int i =1;i<n;i++) {
		if(n%i == 0) {
			sum += i;
			
		}
	}
	if(sum==n) {
		System.out.println("PERFECT NUMBER ");
	}else {
		System.out.println("NOT PERFECT NUMBER");
	}
	
}
}
