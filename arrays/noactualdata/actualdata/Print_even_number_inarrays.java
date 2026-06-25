package arrays.noactualdata.actualdata;
import java.util.*;
public class Print_even_number_inarrays {

public static void even_number(int [] arr) {
	for(int i =0;i<=arr.length-1;i++) {
		if(arr[i]%2==0) {
			System.out.println("EVEN NUMBER "+arr[i]);
			}
	}
	
}


public static void main(String[] args) {
	int [] a = {2,3,23,46};
	even_number( a);
	
}
}
