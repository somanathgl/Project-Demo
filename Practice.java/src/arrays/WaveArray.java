package arrays;

import java.util.Arrays;

public class WaveArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {5,2,1,4,3,6};
		
		Arrays.sort(a);
		for(int i=0;i<a.length;i++) {
		System.out.print(a[i]+" ");
		}
		System.out.println();
		
		for(int i=0;i<a.length-1;i++) {
			int temp=a[i];
			a[i]=a[i+1];
			a[i+1]=temp;
			i++;
			//break;
			
		}

		for(int i=0;i<a.length;i++) {
		System.out.print(a[i]+" ");
	}
	}
}
