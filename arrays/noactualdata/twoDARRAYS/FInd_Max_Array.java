package arrays.noactualdata.twoDARRAYS;

public class FInd_Max_Array {
public static void main(String[] args) {
	int [][] a = {{1,2},{3,5},{6,89}};
	int max = a[0][0];
	for(int i =0;i<a.length;i++) {
		for(int j =0;j<a[i].length;j++) {
			if(a[i][j]>max) {
				int temp= a[i][j];
				a[i][j]= max;
				max = temp;
			}
			
		}
		
	}
	System.out.println("MAX ELEMENT IN THE ARRAY :"+max);
}
}
