package arrays.noactualdata.actualdata;

public class linear_Search {
	public static int   l_search(int [] a, int target) {
		for(int i =0;i<a.length-1;i++) {
			if(a[i]==target) {
				return i;
			}
		}
		return -1;
	}
public static void main(String[] args) {
	int [] arr = {33,23,45,67,76,89};
	int tar = 45;
	int result = l_search(arr,tar);
	if(result != -1) {
		System.out.println("ARRAY FOUND AT INDEX :"+result);
		
	}else {
		System.out.println("ARRAY NOT FOUND");
	}
	
}
}
