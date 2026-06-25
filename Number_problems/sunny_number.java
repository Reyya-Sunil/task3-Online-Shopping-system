package Number_problems;
import java.util.*;
public class sunny_number {
	public static boolean perfectS(int n ) {
		int j =n;
		int next = j+1;
		boolean isPerfect  = false;
		for(int i =1;i<next/2;i++) {
			if(i*i==next) {
				isPerfect = true;
				break;
				
			}
		}
		return isPerfect;
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("ENTER A NUMBER TO KNOW SUNNY OR NOT :");
	int n = sc.nextInt();
	
	if(perfectS(n)) {
		System.out.println("SUNNY NUMBER ");
	}else {
		System.out.println("NOT SUNNY");
	}
	
}
}
