package CopyObjectOneVariableToAnother;

public class StudentDriver {
public static void main(String[] args) {
	Student s1 =Student.returningRef();
	s1.name = "Sunil";
	s1.age=19;
	s1.id=123;
	System.out.println("Student Name :"+s1.name);
	System.out.println("Student ID :"+s1.id);
	System.out.println("Student age :"+s1.age);
	System.out.println("________________________________________");
	Student s2 = Student.returningRef();
	s2.name = "harish";
	s2.age=20;
	s2.id=23;
	System.out.println("Student Name :"+s2.name);
	System.out.println("Student ID :"+s2.id);
	System.out.println("Student age :"+s2.age);
	System.out.println("________________________________________");
	
}
	
}
