package arrays.noactualdata.twoDARRAYS;

public class Sum_of_col {
public static void main(String[] args) {
	int [][] a = {{1,2},{2,5},{6,7} };
       int row = a.length;
       int col = a[0].length;
       for(int i =0;i<col;i++) {
    	   int sum =0;
    	   for(int j = 0;j<row;j++) {
    		   sum+=a[j][i];
    	   }
    	   System.out.println("SUM OF COL NO :"+(i+1)+" :"+sum);
       }
}}
