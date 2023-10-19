package arrays;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateEleUsingCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int a[]= {1,5,5,8,1,4,6,9,4,7,2};
           
           Set<Integer>s=new HashSet<>();
           for(int no:a) {
        	   boolean b=s.add(no);
        	   if(b==false) {
        		   System.out.println(no);
        	   }
           }
	}

}
