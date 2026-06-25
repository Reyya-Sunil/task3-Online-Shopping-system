package Blocks;

public class MultipleBlocks {
	static {
		System.out.println("Hi i am first static block :");
	}
	{
		System.out.println("hi i am first non static block");
	}
	static {
		System.out.println("hi i am second static block");
	}
	{
		System.out.println("hi i am second non static block");
	}
	public static void main(String[] args) {
		MultipleBlocks m = new MultipleBlocks();
	}
}
