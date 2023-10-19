package arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SortZerosneTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {0,1,1,0,1,2,0,1,2};
		
		
		for(int  i=0;i<a.length;i++) {
			
			for(int  j=i+1;j<a.length;j++) {
				
				if(a[j]<a[i]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
				
		}
		for(int  i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
			
	}

}
