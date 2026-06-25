package decision_making_statement;
import java.util.*;
public class switchQs4 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number to select MENU (1-6) :");
	int menu = sc.nextInt();
	switch(menu) {
	case 1 :{
		System.out.println("Burgeris available");
		break;
	}
	case 2 :{
		System.out.println("Pizza is available");
		break;
	}
	case 3 :{
		System.out.println("Sandwich is available");
		break;
	}
	case 4 :{
		System.out.println("French Fries is available");
		break;
	}
	case 5 :{
		System.out.println("Soup is available");
		break;
	}
	case 6 :{
		System.out.println("Spring Rolls is available");
		break;
	}
	default :{
		System.out.println("! No  fast food items is available ");
	}
	
	}
}
}
