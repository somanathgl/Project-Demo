package String;

public class MaxOccuranceOfCharSecondWay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="sombanabbbsbth";
		
		String s1="";
		
		for (int i = 0; i < s.length(); i++) {
			int count = 0;

			for (int j = 0; j < i; j++) {
				if (s.charAt(i) == s.charAt(j)) {
					count++;
				}
			}
			if (count==0) {
				s1=s1+s.charAt(i);
			}
		}
		
		//int max=Integer.MIN_VALUE;
		int index=0;
		int max=0;
		for (int i = 0; i < s1.length(); i++) {
			int count = 0;

			for (int j = 0; j < s.length(); j++) {
				if (s1.charAt(i) == s.charAt(j)) {
					count++;
				}
				
			}
			if (max<count) {
				max=count;
				index=i;
			}
		}
		System.out.println(s1.charAt(index)+" "+max);
	}

}
