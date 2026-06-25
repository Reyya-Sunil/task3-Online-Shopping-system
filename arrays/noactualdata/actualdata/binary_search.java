package arrays.noactualdata.actualdata;
import java.util.Arrays;
import java.util.*;
public class binary_search {
	public static int bs(int [] a,int target) {
		int start =0;
		int end = a.length-1;
		int index = -1;
		while(start<=end) {
			int mid = (start+end)/2;
			if(a[mid]==target) {
				index = mid;
				break;
			}
			else if(target>a[mid])  {
				start = mid+1;
			}
			else if(target<a[mid]) {
				start = mid-1;
			}
		}
		return index;
	}
	
public static void main(String[] args) {
	int [] arr = {12,24,53,23};
	Arrays.sort(arr);
	int tar = 24;
	int res =bs( arr, tar);
	
	if( res != -1) {
	System.out.println("Target elemnt at index :"+bs(arr,tar));
}else {
	System.out.println("target not found");
}
}}
