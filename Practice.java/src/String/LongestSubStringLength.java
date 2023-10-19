package String;

import java.util.HashSet;
import java.util.Set;

public class LongestSubStringLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="abcdabcdbb";
		
		int i=0;
		int j=0;
		int maxcount=0;
		Set<Character>st=new HashSet<>();
		while(i<s.length()&&j<s.length()) {
			                                      
			if(!st.contains(s.charAt(j))) {       
				st.add(s.charAt(j));                
				j++;
				maxcount=Math.max(maxcount, j-i);  
				
				
			}
			else {
				st.remove(s.charAt(i));
				i++;
				
			}
				
			
		}
		System.out.println(maxcount);
		
	}

}
