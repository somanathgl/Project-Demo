package arrays;

import java.util.ArrayList;

public class SubArrayWithSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,2,3,7,5};
		int n=5;
		int Givensum=12;
		//int sum=0;
		int cnt=0;
		for(int i=0;i<=a.length;i++) {
			 int sum=0;
			for(int j=i;j<a.length;j++) {
				
					sum=sum+a[j];
					if(Givensum==sum) {
						
						System.out.print(a[j]+" ");
						cnt++;
					
	         }
			//System.out.println();
			
		}
	 }
		
	}	}
		
	/*	ArrayList<Integer>ar=new ArrayList<>();
		int i=0;
		int sum=0;
		
		for(int j=0;j<n;j++) {
		  sum=sum+a[j];
			
		while(Givensum<sum) {
			sum=sum-a[i];
			i++;
		}
		
		if(sum==Givensum ) {
			ar.add(i+1);
			ar.add(j+1);
			System.out.println(ar);
		}
		
		}
		
	}

}*/
