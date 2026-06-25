package arrays.noactualdata;
import java.util.*;

public class user_input_array {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("ENTER YOUR SIZE OF ARRAYS ");
	int n = sc.nextInt();
	int [] arr  = new int [n];
    System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------");
	for(int i =0;i<arr.length;i++) {
	System.out.print("ENTER THE "+(i+1)+" DATA : ");
	arr[i]=sc.nextInt();
	
		
	}
	System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------");
		for(int i =0;i<arr.length;i++) {
	System.out.println("YOUR OUTPUT DATA "+(i+1)+": "+arr[i]);
			
		}
		
    System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------");
   for(int i = 0;i<arr.length;i++) {
	   if(arr[i]%2==0) {
		   System.out.println("ARAAY OF EVEN NUMBER DATA "+(i+1)+":"+arr[i]);
	   }
	   
   }
 ]
}

}
