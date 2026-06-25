package Number_problems;

public class Neon_Number {
public static void main(String[] args) {
	int n = 9;
	int sq= n*n;
	int sum = 0;
	 while (sq != 0) {
		 int digit = sq %10;
		 sum += digit;
		 sq /= 10;
		 
	 }
	 if(sum==n ) {
		 System.out.println("Neon number");
	 }else {
		 System.out.println("Not neon number");
	 }
}
}
