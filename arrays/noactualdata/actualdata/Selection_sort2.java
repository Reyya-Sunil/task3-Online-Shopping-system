package arrays.noactualdata.actualdata;

public class Selection_sort2 {
	public static void S_sort(int [] a) {
		for(int i =0;i<a.length-1;i++) {
			for(int j =0;j<a.length-1;j++) {
				if(a[j]>a[j+1]) {
					int temp = a[j];
					a[j] =a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println();
		System.out.println("AFTER SORTING ");
		for(int i :a) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.print("-------------------------------------------------------------------------");
	}
public static void main(String[] args) {
	int [] arr = {23,12,34,21,67,98,56};
	System.out.println("BEFORE SORTING");
	for(int k :arr) {
		System.out.print(k+" ");
	}
	System.out.println();
	System.out.print("-------------------------------------------------------------------------");
	S_sort( arr);
}
}
