package arrays.noactualdata.actualdata;

public class find_avg_2nd_half {
public static void main(String[] args) {
	int [] a = {23,24,25};
	int len = a.length;
	int secondsum =0; 

	for(int i =a.length/2;i<=a.length-1;i++) {
		secondsum += a[i];
	}
	double avg = secondsum /2;
	System.out.println(avg);
}
}
