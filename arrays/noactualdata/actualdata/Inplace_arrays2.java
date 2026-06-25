package arrays.noactualdata.actualdata;

public class Inplace_arrays2 {
	public static void In_palce (int [] a ) {
		int i = a.length-1;
		for(int j =0;j<a.length-1;j++) {
			if(i>=j) {
			int temp = a[i];
			a[i] = a[j];
			a[j]= temp;
		}
			i--;
			}System.out.println();
		System.out.println("AFTER SORTING");
		for(int k : a) {
			System.out.print(k+" ");
		}
		
		
		
	}

public static void main(String[] args) {
	int [] arr = {23,45,67,89,90,87};
	System.out.println("BEFORE SORTING :");
	for(int i : arr) {
		System.out.print(i+" ");
	}
	In_palce(arr);
	
}
}