package arrays.noactualdata.actualdata;

public class selection_sort {
	
public static void main(String[] args) {
	int [] arr = {23,43,21,56,78	};
	for(int i  =0;i<arr.length-1;i++) {
		int small =i;
		for(int j =i+1;j<arr.length-1;j++) {
			if(arr[j]<arr[small]) {
				small =j;
			}
			
		}
		int temp = arr[i];
		arr[i]=arr[small];
		arr[small]=temp;
	}
	
	for(int j : arr) {
		
		System.out.print(j+" ");
	}
	
}
}
