package constructor_overloading;

public class This_call_driver {
public static void main(String[] args) {
	This_Call s1 = new This_Call("SUNIL",1,24,"AI/ML");
	System.out.println("NAME : "+s1.name);
	System.out.println("ID :"+s1.id);
	System.out.println("AGE :"+s1.age);
	System.out.println("BRANCH :"+s1.dept);
	
}
}
