package constructor_overloading;

public class Non_Static_intilizer {
	int age;
	{
		System.out.println("From   1 intit");
	}
	Non_Static_intilizer (){
		System.out.println("No args constructor");
	}
	{
		System.out.println("from  3 intit");
	}
	Non_Static_intilizer(int age ){
		this.age  = age;
		System.out.println("parameter constructor");
	}
	{
		System.out.println("from 4 intit");
	}
}
