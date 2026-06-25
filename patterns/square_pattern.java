package patterns;
import java.util.*;
public class square_pattern {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("ENTER YOUR NUMBER FOR ROW :");
	int n = sc.nextInt();
	System.out.println("ENTER YOUR NUMBER FOR COL :");
	int j =sc.nextInt();
	for(int i =1;i<=n;i++) {
		for(int k =1 ;k<=j;k++) {
			System.out.print(" * ");
		}
		System.out.println();
	}
}
}
