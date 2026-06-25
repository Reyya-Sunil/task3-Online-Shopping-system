package methods;

public class QS13 {
	public static String letter_case(char a) {
		String result  = Character.isUpperCase(a) ?"Upper case":"lowercase";
		System.out.println(result);
		return result;
	}
public static void main(String[] args) {
	letter_case('A');
}
}
