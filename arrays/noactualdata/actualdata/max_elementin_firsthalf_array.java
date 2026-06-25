package arrays.noactualdata.actualdata;

public class max_elementin_firsthalf_array {
public static void main(String[] args) {
	int  []a = {23,45,65,43,22,42};
	int max = a[0];
	for(int i =0;i<a.length/2;i++) {
		if(a[i]>max) {
			max =a[i];
		}
	}
	System.out.println(max);
}
}
