package arrays.noactualdata.twoDARRAYS;

public class arrays_with_2Dactualdata {
public static void main(String[] args) {
	int [][] a = {{23,65},{45,67,89},{98,79,45,67}};
	for(int i =0;i<a.length;i++) {
		for(int j =0;j<a[i].length;j++) {
			System.out.print(a[i][j]+" ");
		}
		System.out.println();
	}
}
}
