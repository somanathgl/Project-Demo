package String;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Reverse Each Character in String
		String s1="Somanath lokhande";
		String sa[]=s1.split(" ");
		 for(int i=s1.length()-1;i>=0;i--) {
			 char ch=s1.charAt(i);
			
			 System.out.print(ch);
		 }
		 System.out.println();
		 
//Reverse String 
		 for(int i=sa.length-1;i>=0;i--) {
			// char ch=sa.charAt(i);
			
			 System.out.print(sa[i]+" ");
		 }
	}

}
