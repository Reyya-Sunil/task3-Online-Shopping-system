package constructor_overloading;
import java.util.*;
public class laptopDriver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER YOUR LAPTOP NAME :");
		String name = sc.nextLine();
		System.out.println("ENTER YOU BRAND NAME : ");
		String brand = sc.nextLine();
		System.out.println("ENTER YOUR PRICE :");
		int price = sc.nextInt();
		
		laptop s1 = new laptop(name,brand,price);
		s1.display();
	}



}
