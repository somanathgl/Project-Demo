package arrays;

public class FindMaxEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {5,9,8,8,77,55,33,40};
		
		int max=0;
		for(int  i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
			
		}
		System.out.println(max);
	}

}
