package arrays;

public class MoveAllZerostoEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {10,0,20,5,0,6,0,7,0};
		
		for(int i=0;i<a.length;i++) {
	      	  
	      	  for(int j=i+1;j<a.length;j++) {
	      		if(a[i]<a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
					
				}
					 
			 }
	      	
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		
	}

}
