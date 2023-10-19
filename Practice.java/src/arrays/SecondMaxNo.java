package arrays;

public class SecondMaxNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		int a[]= {10,2,5,9,7,4,6,8};
		int max=0;
		for(int i=0;i<a.length;i++) {
			
				if(max<a[i]) {
					
				max=a[i];
				
			}
		}
		int max1=0;
		for(int i=0;i<a.length;i++) {

			if(max1<a[i] && max!=a[i]) {
				
			max1=a[i];
		}
	 }
		System.out.println(max);
		System.out.println(max1);
	}

}
