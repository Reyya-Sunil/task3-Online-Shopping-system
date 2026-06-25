package Number_problems;
import java.util.*;
public class Duck_num {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your Number: ");
	String d = sc.nextLine();
	if(d.charAt('0')=='0') {
		System.out.println("NOT DUCK ");
	}else if(d.contains("0")) {
		System.out.println("DUCK ");
	}else {
		System.out.println("NOT DUCK");
	}
	
}
}
