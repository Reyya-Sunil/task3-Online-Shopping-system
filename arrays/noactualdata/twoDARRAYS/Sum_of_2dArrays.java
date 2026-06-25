package arrays.noactualdata.twoDARRAYS;

public class Sum_of_2dArrays {
public static void main(String[] args) {
	int [] [] a = {{12,24},{23,45},{43,26}};
	int sum =0;
	for(int i =0;i<a.length;i++) {
		for(int j =0;j<a[i].length;j++) {
			sum +=a[i][j];
		}
	}
	System.out.println("TOTAL SUM OF ARRAY : "+sum);
}}
