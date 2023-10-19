package pracise1;

import java.util.HashSet;

public class Removedupliateusinghash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {10,20,30,30,20,40};
		
		HashSet<Integer>hs=new HashSet<>();
		
		 for(int no:a){
			boolean b= hs.add(no);
			if (b==false){
				System.out.println(no);
			}
			//System.out.println(no);
		 }
	}

}
