package String;

public class LongestSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="abcdaabcdefa";
		
		String max="";
		
		for(int i=0;i<s.length();i++)
		{
			String s1="";
			s1=s1+s.charAt(i);
			
			if(s1.charAt(0)!=s.charAt(i+1)) {
				max=s.charAt(i);
			}
					
				
			
		}
		
		
	}

}
