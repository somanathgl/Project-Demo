package arrays;

public class FindMissingEleInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,2,3,4,6};
		
	/*	int exp_no_ele=a.length+1;
		int total_sum=exp_no_ele*(exp_no_ele+1)/2;
		//System.out.println(total_sum);
		
		int sum=0;
		for(int  i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		
		int missing_ele = total_sum-sum;
		System.out.println("Missing element = "+missing_ele);*/
		
	// Second Way to find Missing Element in array
		
		 int xor1=a[0];
		for(int  i=0;i<a.length;i++) {
			xor1=xor1^a[i];
		}
		int xor2=1;
		for(int  i=2;i<a.length+1;i++) {
			xor2=xor1^i;
		}
		System.out.println("Missing Element = "+(xor1^xor2));
		
		
	}

}
