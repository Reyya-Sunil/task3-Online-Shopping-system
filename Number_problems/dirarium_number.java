package Number_problems;


public class dirarium_number {
	public static boolean check(int n) {
		int k = n;
		int count = 0;
		
		while(k !=0) {
			int d = k %10;
			count ++;
			k /= 10;
		}
		int l = n;
		int sum =0;
		
		while(l!=0) {
			int d = l%10;
			sum += pow(d,count);
			l /= 10;
		}
		return n == sum ? true : false;
	}
	public static int pow(int digi ,int count) {
		int powe =1;
		for(int i= 1;i<=count;i++) {
			powe *= digi;
		}
		return powe;
	}

	public static void main(String[] args) {
		int num = 153;
		System.out.println(check(num));
		
		
	}
}
