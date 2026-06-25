package Number_problems;
import java.util.*;
public class Buzz_Number {
	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("ENTER YOUR NUMBER TO KNOW BUZZ OR NOT :");
	int num = sc.nextInt();
	if(num%7==0 ||num%7 == 7) {
		System.out.println("BUZZ NUMBER");
	}else {
		System.out.println("NOT BUZZ NUMBER");
	}
}
}
