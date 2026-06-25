package Number_problems;
import java.util.*;
public class Atomorphic_number {
	/// count method 
	public static boolean count(int n) {
		int j = n;
		int sq = n*n;
		int count = 0;
		while(j>0) {
			int digit = j%10;
			count ++;
			j /= 10;
		}
		///to extract the last digit 
		int lastdigit = sq%pow(10,count);
		return n == lastdigit ? true :false;
	}
	///power method 
	public static int pow(int digit,int count) {
		int modcount = 1;
		for(int i =1;i<=count;i++) {
			modcount *=digit;
		}
		return modcount;
	}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("ENTER YOUR NUMBER TO KNOW AUTOMORPHIC OR NOT :");
int n = sc.nextInt();
	System.out.println(count(n));
}
}
