package arrays.noactualdata.twoDARRAYS;

public class find_min_array {
public static void main(String[] args) {
	int [] [] a = {{3,1},{2,3},{9,3}};
	int min = a[0][0];
	for(int i = 0;i<a.length;i++) {
		for(int j =0;j<a[i].length;j++) {
			if(a[i][j]<min) {
				int temp =a[i][j];
				a[i][j]=min;
				min = temp;
			}
		}
	}
	System.out.println("MINIMUM ELEMENT IN ARRAY "+min);
	
	
}}
