package OOPS.INHERITANCE;

public class Manger  extends Employee{
 int bonus;
 void totalSalary(int salary, int bonus) {
	 display(salary);
	 System.out.println("Total Salary with Bonus :"+(bonus+salary));
	
 }
}
