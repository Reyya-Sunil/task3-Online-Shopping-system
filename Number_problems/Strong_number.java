package Number_problems;

public class Strong_number {

public static void main(String[] args) {
	int n = 245;
int j =n;
	int finalans =0;
	while(j>0) {
		int d = j%10;
		int fact =1;
		for(int i =1;i<=d;i++) {
			  fact *=i;
			
		}
		finalans +=fact;
		j/=10;
		
	}
	 
	if(n==finalans) {
		System.out.println("STRONG NUMBER");
	}else {
		System.out.println("NOT STRONG NUMBER");
	}
	
}
}
