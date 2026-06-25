package decision_making_statement;
import java.util.*;
public class elseifQs2 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your Marks :");
	int marks = sc.nextInt();
	if(marks <=100 && 90>=marks) {
		System.out.println("Grade : A");
		
	}else if(marks <=89 && 70>=marks) {
		System.out.println("Grade : B");
	}else if(marks <=69 && 50 >=marks) {
		System.out.println("Grade : C");
    }else {
    	System.out.println("Fail");
    }
	
	
}
}
