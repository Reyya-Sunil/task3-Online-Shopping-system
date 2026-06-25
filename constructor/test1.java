package constructor;

public class test1 {
int i ; 
int j ;

public test1() {
	i=10;
	j=40;
}
public test1(int a,int b) {
	this.i =a;
	this.j =b;
	
}
public static void main(String[] args) {
	test1 sp = new test1();
	test1 sp2 = new test1(10,20); 
	System.out.println(sp.add());
	System.out.println(sp2.add());
	

}
public int add() {
	return i+j;
}
}
