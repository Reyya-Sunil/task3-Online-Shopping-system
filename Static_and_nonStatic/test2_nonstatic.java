package Static_and_nonStatic;

public class test2_nonstatic {
    static {
    	System.out.println("Static block");
    }
    {
    	System.out.println("non static block");
    }
    public test2_nonstatic () {
    	System.out.println("constructor");
    }
    public static void main(String[] args) {
    	test2_nonstatic sc = new  test2_nonstatic();
    	System.out.println("Main-method");
		
	}
}
