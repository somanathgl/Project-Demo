package arrays;

public class StockByeAndSell {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {5,7,2,4,9,1};
		int maxprof=0;
		int minsofar=a[0];
		
		for(int i=0;i<a.length;i++) {
			minsofar=Math.min(minsofar, a[i]);
			//int profit=a[i]-minsofar;
			maxprof=Math.max(maxprof, a[i]-minsofar);
			
		}
		System.out.println(maxprof);
		System.out.println(minsofar);
	}

}
