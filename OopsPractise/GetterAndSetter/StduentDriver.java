package OopsPractise.GetterAndSetter;
import java.util.*;
public class StduentDriver {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your Name : ");
	String name = sc.nextLine();
	System.out.println("Enter your Marks : ");
	int marks = sc.nextInt();
	System.out.println("Enter your Age : ");
	int age = sc.nextInt();
	Stduent s = new Stduent();

	System.out.println("____________________________________");
	s.setname(name);
	s.setmarks(marks);
	s.setage(age);
	
	
	System.out.println("Stduent Marks :"+s.getname());
	System.out.println("Stduent Age :"+s.getage());
	System.out.println("Stduent Marks :"+s.getmarks());
	System.out.println("____________________________________");
}
}
