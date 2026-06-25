package arrays.noactualdata.actualdata;

public class insertion_sort {
	public static int [] insertion (int [] a ) {
		
		int j;
		for(int i =1;i<a.length;i++) {
			j=i;
			while(j>0 && a[j]>a[j-1]) {
				int temp = a[j];
				a[j]=a[j-1];
				a[j-1]=temp;
				j--;
			}
		}
		return a;
	}
	public static void main(String[] args) {
		int [] arr = {23,12,24,56,42,32};
		System.out.print("BEFORE SORTING ");
		for(int k :arr) {
			System.out.print(k+" ");
		}
		System.out.println();
		System.out.print("___________________________________________________________________________________");
		System.out.println();
		int[] result = insertion ( arr );
		System.out.print("AFTER SORTING ");
		for(int i  : result ) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.print("_________________________________________________________________________________");
		
	}
}