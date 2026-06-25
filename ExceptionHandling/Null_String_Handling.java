package ExceptionHandling;

public class Null_String_Handling {
public static void main(String[] args) {
	String name = null;
	try {
		int leng = name.length();
		System.out.println(leng);
	}
	catch(NullPointerException s) {
		System.err.println("String is null");
		throw s;
	}
	
}
}
