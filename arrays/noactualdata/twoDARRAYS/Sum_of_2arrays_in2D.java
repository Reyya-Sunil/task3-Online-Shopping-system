package arrays.noactualdata.twoDARRAYS;

public class Sum_of_2arrays_in2D {
	public static void main(String[] args) {
		int r1 =3;
		int c1=3;
		int res [][] =new int [r1][c1];
		int [] [] a = {{1,2,3},{4,5,6},{6,7,8}};	
		int [][] b ={{1,2,3},{4,5,6},{6,7,8}};
		for(int i =0;i<a.length;i++) {
			for(int j =0;j<a[i].length;j++) {
				System.out.print(a[i][j]+b[i][j]+"  ");
			}
			System.out.println();
		}
		System.out.print("--------------------------------------------------------------------");
		System.out.println();
		for(int i =0;i<a.length;i++) {
			for(int j =0;j<a[i].length;j++) {
				   res [i] [j]= a[i][j]+b[i][j];
				   System.out.print(res[i][j]+"  ");
			}
			System.out.println();
			
		}
	}
}


