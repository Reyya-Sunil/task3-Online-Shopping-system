package operators;
/*
        ***question***
  Does the expression true + " is the answer" result in a compiler error or a String?
 */

public class Op15 {
public static void main(String[] args) {
	String p = true+" is the answer";
	System.out.println(p);
	/*
	 in java where when we used concatination  where (true) is automatic converted into string 
	 and (is the answer ) is already string then  it from concatination
	 */
}
}
