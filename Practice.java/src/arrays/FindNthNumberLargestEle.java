package arrays;

public class FindNthNumberLargestEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[]= {1,55,6,8,4,2,3};
		int temp=0;
		int n=5;
		for(int  i=0;i<a.length-1;i++) {
			
			for(int  j=i+1;j<a.length;j++) {
				
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			if(i==n-1) {
				System.out.print(a[i]);
			}
		}
		System.out.println();
		for(int  i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
}

}

