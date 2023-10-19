package String;

public class CharAtIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		String s="somanath";
		
		int index=10;
		int cnt=0;
		char c[]=s.toCharArray();
		for (int i = 0; i < c.length; i++) {
			cnt++;
			if (index==i) {
				System.out.println(c[i]);
			}
		}
		if (c.length<index) {
			System.out.println("out of bound");
		}

	}

}
