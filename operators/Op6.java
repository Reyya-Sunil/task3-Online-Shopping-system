package operators;
/*
    ***question***
    Does the following code compile: boolean x = "10" == 10;? Why or why not?

 */
public class Op6 {
public static void main(String[] args) {
 String x ="10";
 System.out.print(x==10);
 /*
  in relation operator ==
  if bot are premitive compare there values
  but in this one is string(non primitive) and other one is int (primitive)
  since no automatic conversion between string and int so this is type mismatch error
  */
}
}
