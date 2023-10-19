package String;

public class MaximumccuranceChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="cccdddd";
		
		int a[]=new int[127];
		
		 for(int i=0;i<=s.length()-1;i++) {
			 
			 a[s.charAt(i)]=a[s.charAt(i)]+1;
		 }
		 int max=-1;
		 char c=' ';
		 int count=0;
		 for(int i=0;i<=s.length()-1;i++) {
			 
			 if(max<a[s.charAt(i)]) {
				 max=a[s.charAt(i)];
				 count=max;
				c=s.charAt(i);
			 }
		 }
		 System.out.println( "Maximum Occuring Charater is = "+c +" " +" and its Occurance is = "+count);
		 
	}

}
