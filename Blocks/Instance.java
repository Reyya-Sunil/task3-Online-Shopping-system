package Blocks;

public class Instance {
	
/// instance block
	{
		System.out.println("Hi i am instance block");
	}
	Instance(){
		System.out.println("Hi i am constructor");
	}
	public static void main(String[] args) {
		Instance v = new Instance();
	}
}
