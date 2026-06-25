package inc_and_dec_operator;
/*
     ***question***
     1. int a = 5;
        int b = 10;
        int c = ++a + b++;
        System.out.println(a + " " + b + " " + c);
 */
public class Qs4 {
public static void main(String[] args) {
	int a =5;
	int b =10;
	int c = ++a + b++;
	System.out.println("a :"+a+" b :"+b+" c :"+c);
}
}
