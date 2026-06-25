package Imp_problems;
import java.util.*;


public class fibonaci_for {
	public static void fibo_op( int num) {
		int a =0;
		int b =1;
		System.out.print(a+" "+b);
		int c;
	
		for(int i =1;i<num;i++) {
			 c=a+b;
			 System.out.print(" "+c+" ");
			 // swaping done 
			 a=b;
			 b=c;
			 
		}
		
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number to print fibonaci :");
	int num = sc.nextInt();
	fibo_op(num);
}
}
