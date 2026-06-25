package decision_making_statement;
import java.util.*;
public class elseifQs1 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter your First Num :" );
int num1 =sc.nextInt();
System.out.print("Enter your Second  Num :" );
int num2 =sc.nextInt();
System.out.print("Enter your third  Num :" );
int num3 =sc.nextInt();
if(num1>num2 &&num1>num3) {
	System.out.println("Greater Number is :"+num1);
}else if (num2>num1 &&num2>num3) {
	System.out.println("Greater Number is :"+num2);
}else {
	System.out.println("Greater Number is :"+num3);
}
}
}
