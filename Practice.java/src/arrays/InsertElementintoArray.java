package arrays;

public class InsertElementintoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {10,20,40,50,60};
		
		int ele=30;
		int position=3;
		
		for(int i=a.length-1;i>position-1;i--) {
			
			a[i]=a[i-1];
		}
		a[position-1]=ele;
	
	for(int i=0;i<a.length;i++) {
		System.out.print(a[i]+" ");
	}
 }
}
