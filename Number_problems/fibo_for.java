package Number_problems;
import java.util.*;
public class fibo_for {
	public static int fibo(int num ) {
	 int a =0;
	 int b =1;
	 int s=0;
	 for(int i =2;i<=num;i++) {
		  s =a+b;
		  System.out.print(" "+s+" ");
		
		 a=b;
		 b=s;
	 }
	return s;
	 
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("ENTER YOUR NUMBER :");
  int num = sc.nextInt();
  System.out.println("YOUR FIBO OUTPUT :"+fibo(num));
  
}
}
