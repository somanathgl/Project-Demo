package pattern;


import java.util.HashMap;
import java.util.Map;

public class OccuranceOFNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,2,3,4,4,4,1,3,5,5,1,1,1};
		
		
		
       Map<Integer, Integer>hs=new HashMap<>();
		
		 for(int i=0;i<a.length;i++) {
				
			
				 if(hs.containsKey(a[i])) {
					 
		        	hs.put(a[i], hs.get(a[i])+1);
		        	
	        	 }
				 else {
					 hs.put(a[i], 1);
		       }
		 }
			
				 for(Map.Entry<Integer, Integer> e: hs.entrySet()) {
					 
					 System.out.println(e.getKey()+" "+e.getValue());
					 
		 
		 
		 }
	}
}


		
		
