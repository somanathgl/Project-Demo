package String;

public class ContainsMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="ansbsabcdsjhs";
		String s1="abc";
		
		//System.out.println(s.contains(s1));
		
		//Implementation
		//boolean a=false;
		if(s1.length()<s.length()){
			boolean b=false;
			
			for(int i=0;i<s.length();i++) {
				if(s1.length()==0){
					System.out.println(true);
					break;
				}
				if(s1.charAt(0)==s.charAt(i)){
					int start=i;
					int cnt=0;
					for(int j=0;j<s1.length();j++) {
						if(s1.charAt(j)==s.charAt(start)){
							cnt++;
							start++;
						}
						if(s1.length()==cnt){
							b=true;
							System.out.println(true);
							
						}
						
							
					}
				}
				
				
			}
			
		}
	}
}

