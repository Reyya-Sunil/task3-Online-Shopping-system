package constructor;

public class Constructorpractise {
	{
		System.out.println("i am nonm static block");
	}
public  Constructorpractise () {
	
	System.out.println("i am constructor ");
}
public static void main(String[] args) {
	 Constructorpractise p = new  Constructorpractise();
	System.out.println("hello iam main block");
	 Constructorpractise d = new  Constructorpractise();
}
}
