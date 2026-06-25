package Number_problems;
import java.util.*;
public class Amrstong_num {
	public static  boolean counti(int n) {
		int j = n;
		int count = 0;
		while(j>0) {
			int digit = j%10;
			count ++;
			j/=10;
		}
		//for extract digit and power 
		int temp =n;
		int sum =0;
		while(temp!=0) {
			int digit = temp %10;
			sum += pow(digit,count);
			temp/=10;
		}
		return n==sum ? true :false;
		
	}
	//power function
	public static int pow(int digit,int count) {
		int fact = 1;
		for(int i =1;i<=count;i++) {
			fact *= digit;
		}
		return fact;
	}
	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int  num = sc.nextInt();
System.out.println(counti(num));

}
}
