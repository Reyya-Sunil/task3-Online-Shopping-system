package OPPS.EncapsulationProblems;

public class EmployeeClass {
private String name;
private int salary;
public void setDetails(String name,int salary) {
	this.name= name;
	this.salary=salary;
	
}


public int getSalary() {
	return salary;
}
public String getName() {
	return name;
}
public static void main(String[] args) {
	EmployeeClass b = new EmployeeClass();
	b.setDetails("Sunil", 4000);
	System.out.print(b.getName());

	System.out.println(": "+b.getSalary());
}

}
