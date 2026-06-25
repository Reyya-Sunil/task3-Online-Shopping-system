package arrays.noactualdata;

public class array_updating {
public static void main(String[] args) {
	int [] arr = new int [4];
	//inserting data 
	arr[0]=12;
	arr[1]= 123;
	arr[2]=130;
	arr[3]=120;
	//before updating the values
	for(int i =0;i<arr.length;i++) {
		System.out.println("Before updating  arr"+i+"="+arr[i]);
	}
	System.out.println("-------------------------------------------");
	//updating values
	arr[1]=300;
	//after updating the values 
	for(int j =0;j<arr.length;j++) {
		System.out.println("After updating  arr"+j+"="+arr[j]);
	}
	System.out.println("---------------------------------------------");
	
}
}
