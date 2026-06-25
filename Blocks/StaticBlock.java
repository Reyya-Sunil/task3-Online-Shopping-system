package Blocks;

public class StaticBlock {
static {
	System.out.println("I am Static block");
}
{
	System.out.println("Hi i am non static block");
}
public static void main(String[] args) {

	System.out.println("Hi i am main block");
	StaticBlock b = new StaticBlock();
}
}
