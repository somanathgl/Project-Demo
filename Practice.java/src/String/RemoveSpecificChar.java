package String;

public class RemoveSpecificChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="somanath";
		char ch='a';
		String s1="";
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)==ch) {
				
			}
			else {
				s1=s1+s.charAt(i);
			}
		}
		System.out.println(s1);
	}

}
