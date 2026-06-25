package methods;

public class Qs9 {
	public static String Even_odd_last(int num) {
int lastdigt =num%10;
String res = lastdigt % 2 == 0 ?"True" : "False";
return res;
	}
	
public static void main(String[] args) {
	System.out.println("Last Digit Even OR False : "+Even_odd_last(246));
}
}
