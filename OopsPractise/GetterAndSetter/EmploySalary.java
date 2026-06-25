package OopsPractise.GetterAndSetter;

public class EmploySalary {
private String name;
private double Salary;
public void setname(String name) {
	this.name=name;
}
public String getname() {
	return name;
}
public void setSalary(int Salary) {
	if(Salary >=10000) {
		this.Salary=Salary;
	}else {
		System.out.println("Salary less then 10000 !");
	}
	System.out.println("Salary before increase :"+Salary);
}
public double getSalary() {
	return Salary;
}
public void icreaseSalary(double percentage) {
	Salary = Salary  *(1+percentage);
	System.out.println("After icreasing percentage Salary :"+Salary);
}
}
