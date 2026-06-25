package OopsPractise.GetterAndSetter;

import java.util.Scanner;

public class ProductDrive {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the price of Product :");
		int pri = sc.nextInt();

		Product P1 = new Product();
		P1.setprice(pri);
	

	}

}
