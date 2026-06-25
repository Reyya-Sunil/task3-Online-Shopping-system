package OopsPractise.GetterAndSetter;

import java.util.Scanner;

public class PasswordDrive {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a username :");
	String user = sc.nextLine();
	
	System.out.println("Enter a password  :");
	String cur =sc.nextLine();
	Password s1= new  Password();
	
	s1.setusername(user);
	System.out.println("Password is :"+s1.checkpassword(cur));
}


}
