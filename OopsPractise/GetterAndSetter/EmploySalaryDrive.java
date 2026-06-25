package OopsPractise.GetterAndSetter;

import java.util.Scanner;

public class EmploySalaryDrive {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("ENTER Increase Salary Percentage : ");
	 double perce= sc.nextDouble();
	
	EmploySalary  E1 = new EmploySalary ();
	E1.setSalary(40000);
	E1.icreaseSalary(perce);
}
}
