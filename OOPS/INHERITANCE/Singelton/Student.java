package OOPS.INHERITANCE.Singelton;

public class Student extends Person {
String name ="Child";
void details() {
	System.out.println("Student Class Variable Name  : "+this.name);
	System.out.println("Person  Class Variable Name  : "+super.name);
}
}
