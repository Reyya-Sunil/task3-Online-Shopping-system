package constructor;

public class CopyConctructor {
	String name;
	int age ;
	CopyConctructor(String name, int age){
		this.name = name;
		this.age =age;
		System.out.println("Name :"+name);
		System.out.println("age :"+age);
	}
	
	CopyConctructor(CopyConctructor s){
		this.name = s.name;
		this.age =s.age;
		System.out.println("Nmae :"+name);
		System.out.println("Age :"+age);
	}
	public static void main(String[] args) {
		CopyConctructor c1= new CopyConctructor("Sunil",19);
		//copying object
		CopyConctructor c2 = new CopyConctructor(c1);
		
	}
}
