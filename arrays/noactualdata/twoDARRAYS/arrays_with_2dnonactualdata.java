package arrays.noactualdata.twoDARRAYS;
import java.util.*;
public class arrays_with_2dnonactualdata {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("ENTER THE ROW SIZE :");
	int row = sc.nextInt();
	System.out.println("ENTER THE COL SIZE: ");
	int col = sc.nextInt();
	
	int [][] a = new int [row][col];
	System.out.println("---------------------------------------------------------------");
	for(int i =0;i<a.length;i++) {
		for(int j =0;j<a.length;j++) {
			System.out.print("ENTER THE VALUE OF row and col "+i+" AND "+j+" :");
		  a[i][j]=sc.nextInt();
		  
		}
		System.out.println();
	}
	System.out.println("-----------------------------------------------------------------");
	for(int i =0;i<a.length;i++) {
		for(int j =0;j<a.length;j++) {
			System.out.print(a[i][j]+" ");
		    
		}
		System.out.println();
		
		
		
	}
	
}
}
