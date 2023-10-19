package arrays;

public class LeastOfSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {4,-2,-3,4,-1,-2,1,5,-1,-3};
		//int a[]= {3,7,90,20,5,50,40};
		
		int start=0;
		int end=0;
		int s=0;
		int max=Integer.MIN_VALUE;
		int min=0;
		
		for(int  i=0;i<a.length;i++) {
		
			min=min+a[i];
			if(max<min){
				max=min;
				start=s;
				end=i;
			}
			if(min<0){
				min=0;
				s=i+1;
			}
		}
		System.out.println(min);
		System.out.println(start);
		System.out.println(end);
	}

}