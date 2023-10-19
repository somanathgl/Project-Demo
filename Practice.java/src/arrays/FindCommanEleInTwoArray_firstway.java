package arrays;

import java.util.HashSet;

public class FindCommanEleInTwoArray_firstway {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {4,3,7,9,2,4,3};
		int b[]= {5,1,4,8,3};
		
		HashSet<Integer>hs=new HashSet<>();
		for(int  i=0;i<a.length;i++) {
			
			for(int  j=0;j<b.length;j++) {
				
				   if(a[i]==b[j]) {
					   
					   hs.add(a[i]);
					  // System.out.println(hs);
					
				}
			}
		}
		for(int no:hs) 
		System.out.print(no+" ");
	}

}
