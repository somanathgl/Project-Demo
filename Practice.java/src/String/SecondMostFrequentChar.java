package String;

public class SecondMostFrequentChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="bbccccddddaaaaaaa";
		String s1="";
		for (int i = 0; i < s.length(); i++) {
			int cnt=0;
			for (int j = 0; j < i; j++) {
				if (s.charAt(i)==s.charAt(j)) {
					cnt++;
				}
			}
			if (cnt==0) {
				s1=s1+s.charAt(i);
			}
		}
		int max=Integer.MIN_VALUE;
		//String s2="";
		for (int i = 0; i < s1.length(); i++) {
			int cnt=0;
			for (int j = 0; j < s.length(); j++) {
				if (s1.charAt(i)==s.charAt(j)) {
					cnt++;
				}
			}
			if (max<cnt) {
				max=cnt;
			}
			
		}
		int max1=Integer.MIN_VALUE;
		int index=0;
		for (int i = 0; i < s1.length(); i++) {
			int cnt1=0;
			for (int j = 0; j < s.length(); j++) {
				if (s1.charAt(i)==s.charAt(j)) {
					cnt1++;
				}
			}
			if (cnt1!=max && max1<cnt1) {
				max1=cnt1;
				index=i;
			}
			
		}
		System.out.println(s1.charAt(index)+" "+max1);
	}

}
