package arrays.noactualdata.twoDARRAYS;

import java.util.Scanner;

public class Sum_of_2arraybyuserinput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("First array input ");
		System.out.print("ENTER THE SIZE 1 ARRAY ROW : ");
		int r1 = sc.nextInt();
		System.out.println("ENTER THE SIZE 1 ARRAY col : ");
		int c1 = sc.nextInt();
		int [][] a = new int [r1][c1];
		System.out.println("-----------------------------------------------------");
		System.out.print("ENTER THE ARRAY VALUES 1 ");
		for(int i =0;i<a.length;i++) {
			for(int j =0;j<a[i].length;j++) {
				System.out.println("ENTER INPUT OF ROW AND COL "+i+"AND"+j+" :");
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Second array input ");
		System.out.print("ENTER THE SIZE 2 ARRAY ROW : ");
		int r2 = sc.nextInt();
		System.out.println("ENTER THE SIZE 2 ARRAY col : ");
		int c2 = sc.nextInt();
		int [][] b =new int [r2][c2];
		System.out.println("-------------------------------------------------------------");
		System.out.print("ENTER THE ARRAY VALUES 2");
		for(int i =0;i<b.length;i++) {
			for(int j =0;j<b[i].length;j++) {
				System.out.print("ENTER INPUT OF ROW AND COL "+i+"AND"+j+" :");
				b[i][j]=sc.nextInt();
			}
			
		}
		
		if(a.length==b.length && a[0].length == b[0].length) {
			for(int i =0;i<a.length;i++) {
				for(int j =0;j<a[i].length;j++) {
					System.out.print(a[i][j]+b[i][j]+" ");
				}
				System.out.println();
			}
		}
		
		
		
	}



}
