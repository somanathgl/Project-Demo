package String;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s="madam";
		  String rev="";
		 for(int i=s.length()-1;i>=0;i--) {
			 
			 rev=rev+s.charAt(i);
		 }
		 if(s.equals(rev)) {
			 System.out.println("This is Palindromme String");
		 }
		 else {
			 System.out.println("this is not a Palindrome String");
		 }
	}

}
