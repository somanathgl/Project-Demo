package String;

public class RemoveDuplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		String s="ssomanmmathaa";
		String s1="";
		String s2="";
		for (int i=0;i<s.length();i++) {
			int cnt=0;
			for (int j=0;j<i;j++) {
				if(s.charAt(i)==s.charAt(j)) {
					cnt++;
				}
				
			}
			if(cnt==0) {
				s1=s1+s.charAt(i);
			}
			else {
				s2=s2+s.charAt(i);
			}
			
			
		}
		System.out.println(s1);
		System.out.println();
		System.out.println(s2);
 
	}

}
