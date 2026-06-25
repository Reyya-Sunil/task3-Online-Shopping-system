package Static_and_nonStatic;

public class MathsUtils {
public static int square(int a) {
	return a*a;
}
public int cube(int a) {
	return a*a*a;
}
public static void main(String[] args) {
	System.out.println("For Square : "+square(2));
	MathsUtils s = new MathsUtils();
	System.out.println("For Cube : "+s.cube(2));
}
}
