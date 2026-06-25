package arrays.noactualdata.twoDARRAYS;

public class Sum_of_row {
public static void main(String[] args) {
	int [][] a = {{1,2},{2,3},{4,5}};
	for(int i =0;i<a.length;i++) {
		int sum_row =0;
		for(int j=0;j<a[i].length;j++) {
			sum_row += a[i][j];
		}
		System.out.println("SUM OF THE ROW "+(i+1)+" :"+sum_row);
	}

	
}
}
