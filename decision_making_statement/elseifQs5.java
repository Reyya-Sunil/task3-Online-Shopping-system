package decision_making_statement;
import java.util.*;


public class elseifQs5 {
public static void main(String[] args) {
	/*
	 * 100 units = bill is 5 ruppes
	 * 101 to 200 units = bill is 7 rupees
	 * above 200 units = bills is 10 ruppes
	 */
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter units consumed:");
	int units = sc.nextInt();
	double bills =0;
	if(units<=100) {
		bills =(units-100)*5;
		
	}else if( units>=101 && units<=200 ) {
		bills = (100*5)+(units-200)*7;
		
	}else {
		bills =(100*5)+(100*7)+(units-200)*10;
	}
	System.out.println("Your current bill :"+bills);
}
}
