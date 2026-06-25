package OOPS.INHERITANCE.Singelton;

public class PersonSuperDriver {
public static void main(String[] args) {
	Student S = new Student();
	S.details();
	System.out.println("_____________________________");
	System.out.println("Student  class name :"+S.name);
}
}
