package decision_making_statement;
import java.util.*;
public class checksplchar {

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
System.out.println("Enter your character to verfiy :");
	String b = sc.nextLine();
	
	
	boolean check = b =="a" && b =="z"||b=="A"&& b =="Z";
	if(check != true) {
		System.out.println("not special char !");
	}else {
		System.out.println("special character");
	}
}
}
