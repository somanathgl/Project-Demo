package arrays;

import java.util.HashSet;

public class FindCommanEleInTwoArraySecondWay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// this logic work only when there is no duplicate element between two array
		
		int a[]= {4,3,7,9,2,4,3};
		int b[]= {5,1,4,8,3};
		
      /*    HashSet<Integer>hs=new HashSet<>();
		
		for(int  no:a) {
			hs.add(no);
		}
		for(int no:b) {
			
			boolean c=hs.add(no);
		
		if(c==false) {
			System.out.print(no+" ");
		}
			
	  }		*/
		
		//2nd logic if there is duplicate element between two arra
		
		HashSet<Integer>hs1=new HashSet<>();
		HashSet<Integer>hs2=new HashSet<>();
		
		for(int  no:a) {
			hs1.add(no);
		}
		for(int  no:b) {
			hs2.add(no);
		}
		for(int no:hs2) {
			boolean c=hs1.add(no);
			if(c==false) {
				System.out.print(no+" ");
			}
		}
		
			
		
	}
		

}
