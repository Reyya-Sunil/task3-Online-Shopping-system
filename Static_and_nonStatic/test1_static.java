package Static_and_nonStatic;

public class test1_static {
	static {
		System.out.println("Static-block");
	}
	{
		System.out.println("Non_staticblock");
	}
public static void main(String[] args) {
	System.out.println("Main-block");
}
}
