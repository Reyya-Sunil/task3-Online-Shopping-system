package inc_and_dec_operator;
/*
    ***question***
    int a = 2;
    int b = 3;
    int c = a++ + b++ + ++a + ++b;
    System.out.println(a + " " + b + " " + c);
 */
public class Qs8 {
public static void main(String[] args) {
	int a =2;
	int b =3;
	int c = a++ + b++ + ++a + ++b;
	System.out.println(" a :"+a+" b :"+b+" c :"+c);
}
}
