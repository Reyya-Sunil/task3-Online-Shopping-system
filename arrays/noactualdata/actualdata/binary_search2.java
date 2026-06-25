package arrays.noactualdata.actualdata;

public class binary_search2 {
	public static int b_search(int [] a,int tar) {
		int start = 0;
		int end = a.length-1;
		int index =-1;
		while(start<=end) {
			int mid = (start+end)/2;
			if(a[mid]==tar) {
				index =mid;
				break;
			}else if(tar>a[mid]) {
				start = mid+1;
				
			}else {
				end =mid-1;
			}
		}
		return index;
	}

	public static void main(String[] args) {
		int [] arr = {23,45,67,89,90};
		int target = 67;
		int result  =b_search(arr,target);
		if(result != -1) {
			System.out.println("ARRAY FOUND AT INDEX "+result);
		}else {
			System.out.println("ARRAY IS NOT FOUND");
		}
		
	}
}
