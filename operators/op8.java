package operators;
/*
 What is the result of 10 + 20 != 30 + "0"?
 */

public class op8 {
public static void main(String[] args) {
	System.out.print(10+20 != 30 +"0");
	/*
	 we default move from left to right
	 left side is binary operator wit bot it return type is int 
	 and when we move to right side it is string+integer then it from concationation
	 it return the string in relation operateor bot side shoulde be same datatype 
	 so it comes error
	 */
}
}
