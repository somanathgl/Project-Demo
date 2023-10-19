package arrays;

import java.util.HashSet;

public class LongestSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {3,9,1,10,4,20,2};
		HashSet<Integer>hs=new HashSet<>();
		for(int  i=0;i<a.length;i++) {
			
			hs.add(a[i]);
		}
		//System.out.println(hs);
		 int length=0;
		for(int  i=0;i<a.length;i++) 
		{
			if(!hs.contains(a[i]-1)) {
				int no=a[i];
				
			
			 while(hs.contains(no)) {
			   no++;
		      }
			 if(length<no-a[i]) {
				 length=no-a[i];
			 }
			}
		}
		System.out.println(length);
			 
		//	a=[1,5,5,5,8,9,5,4,8,4,2]
		//			output: {1:1,5:4,8:2,9:1,4:2,2:1}
			
		
  }
}
