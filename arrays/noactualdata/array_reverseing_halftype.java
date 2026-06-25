package arrays.noactualdata;
import java.util.*;
public class array_reverseing_halftype {
	public static int firstHalf(int[] arr) {
		
		for(int i =0;i<(arr.length)/2;i++) {
			System.out.println("FIRST HALF REVERSE"+arr[i]);
			return arr[i];
		}
		return 0;
		
	
	}
public static void main(String[] args) {
int  [] arr = {1,23,56,89};

System.out.print(firstHalf ( arr) );
}
}
