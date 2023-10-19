package arrays;

public class ByeAndSell2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,4,9,7,5,6};
		int profit=0;
		for(int i=1;i<a.length;i++) {
			if(a[i-1]<a[i]) {
				profit+=a[i]-a[i-1];
				
			}
		}
		System.out.println(profit);
	}
		

}
