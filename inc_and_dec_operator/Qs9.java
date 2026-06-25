package inc_and_dec_operator;
/*
   ***question***
    2. int x = 3;
       int y = x++ + x++ + ++x;
       System.out.println(x + " " + y);
 */
public class Qs9 {
public static void main(String[] args) {
	int x = 3;
	int y = x++ + x++ + ++x;
	System.out.println("x :"+x + " " +"y : "+ y);
}
}
