package decision_making_statement;
import java.util.*;
public class switchQs5 {
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter you character : ");
	String ch = sc.next();
	switch(ch) {
	case "a" :{
		System.out.println("where a is vowels");
		break;
	}
	case "A" :{
		System.out.println("where A is vowels");
		break;
	}
	case "e" :{
		System.out.println("where e is vowels");
		break;
	}
	case "E" :{
		System.out.println("where E is vowels");
		break;
	}case "i" :{
		System.out.println("where i is vowels");
		break;
	}case "I" :{
		System.out.println("where I is vowels");
		break;
	}
	case "o" :{
		System.out.println("where o is vowels");
		break;
	}case "O" :{
		System.out.println("where O is vowels");
		break;
	}case "u" :{
		System.out.println("where u is vowels");
		break;
	}case "U" :{
		System.out.println("where U is vowels");
		break;
	}default :{
		System.out.println("it is consonants");
	}
		}
}
}
