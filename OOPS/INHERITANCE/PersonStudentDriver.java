package OOPS.INHERITANCE;

public class PersonStudentDriver {
private static int age;

public static void main(String[] args) {
	Student S = new Student();
	System.out.println("Age Default value   : "+S.age);
	System.out.println("Marks Default value : "+S.marks);
	System.out.println("Name Default Value  : "+S.name);
	System.out.println("_______________________________");
	System.out.println("After intilizing the value ");
	S.dispalyPerson("Sunil", 19);
	S.displayStudent(95);
	System.out.println("___________________________________");

}
}
