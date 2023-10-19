package String;

public class CheckStringContentDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="1";
		
		//char c[]=s.toCharArray();
		 int cnt=0;
		for (int i = 0; i < s.length(); i++) {
			char ch=s.charAt(i);
			if (ch >= 0 && ch <= 9) {
				cnt++;
			
			}
		}
		if (cnt==0) {
			System.out.println(" not only digit");
		}
		else {
			System.out.println("contains only  digit");
		}
		
	}

}
