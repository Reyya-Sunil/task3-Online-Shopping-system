package Number_problems;
import java.util.*;
public class prime_num {
	public static String prime_cal(int num) {
		int count =0;
		for(int i =1;i<=num;i++) {
			if(num%i==0) {
				count++;
			}
		}
		  if(count==2) {
			return "PRIME NUMBER" ;
		}else {
			return "NOT PPRIME NUMBER";
		}
		
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("ENTER YOUR NUMBER TO KNOW IT PRIME OR NOT :");
	int num = sc.nextInt();
	String total = prime_cal(num);
	System.out.println("YOUR OUTPUT :"+total);
	
}
}
