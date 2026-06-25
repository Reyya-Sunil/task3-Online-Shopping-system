package arrays.noactualdata.actualdata;

public class Inplace_arrays {
public static void main(String[] args) {
	int [] arr = {23,45,34,56};
	
	System.out.println("BEFORE SORTING ");
	for(int l :arr) {
		System.out.print(l+" ");
	}System.out.println();

	int i = arr.length-1;
	for(int j =0;j<arr.length;j++) {
		if(j<=i) {
			int temp = arr[i];
			arr[i]= arr[j];
			arr[j]= temp;
			
		}
	i--;
	}

	System.out.println("AFTER SORTING ");
	for(int k : arr) {
		System.out.print(k+" ");
	}System.out.println();
}}
