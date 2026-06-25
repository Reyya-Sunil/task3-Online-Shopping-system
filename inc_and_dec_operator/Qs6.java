package inc_and_dec_operator;
/*
      ***question***
       3.int a = 2;
        int b = 3;
        int c = 4;
        int d = a++ + ++b + c++;
        System.out.println(a + " " + b + " " + c + " " + d)
 */
public class Qs6 {
public static void main(String[] args) {
	int a =2;
	int b =3;
	int c =4;
	int d = a++ + ++b + c++;
	System.out.println(" a :"+a+" b :"+b+" c :"+c+" d :"+d);
}
}
