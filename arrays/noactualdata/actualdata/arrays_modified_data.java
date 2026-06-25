package arrays.noactualdata.actualdata;

public class arrays_modified_data {
public static void main(String[] args) {
	int [] arr = {2,7,89,46};
	for(int i =0;i<arr.length;i++) {
		System.out.println("BEFORE MODIFYING ARRAY"+i+"="+arr[i]);
	}
	System.out.println("-------------------------------------------");
	// updating the arrays
	arr[2]=20;
	arr[1]=197;
	for(int i =0;i<arr.length;i++) {
		System.out.println("AFTER MODIFYING ARRAY"+i+"="+arr[i]);
	}
	System.out.println("---------------------------------------------");
}
}
