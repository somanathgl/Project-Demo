package arrays;

import java.util.HashSet;

public class RemoveDuplicateUsingHashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,9,2,3,2,5,6};
		
		HashSet<Integer>hs=new HashSet<>();
		
		for(int i=0;i<a.length;i++)
		{
			hs.add(a[i]);
		}
		for(int no:hs)
		{
			System.out.print(no+" ");
		}
		
		
	}

}
