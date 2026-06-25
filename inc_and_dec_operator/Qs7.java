package inc_and_dec_operator;
/*
     ***question***
     1. int a = 5;
        int b = 6;
        int c = a++ + ++a + ++b;
        System.out.println(a + " " + b + " " + c);
 */
public class Qs7 {
public static void main(String[] args) {
	int a =5;
	int b =6;
	int c = a++ + ++a + ++b;
	System.out.println(" a :"+a+" b :"+b+" c :"+c);
}
}
