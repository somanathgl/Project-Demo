package String;

public class SplitAndReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "You all are very very good student";
		
		String sa[]=s1.split(" ");
		
		for (int i = 0; i < sa.length; i++) {
			System.out.print(sa[i]);
		}
		
		int start=0;
		int end=sa.length-1;
		
		while (start<end) {
			String temp=sa[start];
			sa[start]=sa[end];
			sa[end]=temp;
			start++;
			end--;
		}
		
		System.out.println();
		for (int i = 0; i < sa.length; i++) {
			System.out.print(sa[i]+" ");
		}
		
		for (int i = 0; i < sa.length; i++) {
			char ch[]=sa[i].toCharArray();
			
			int start1=0;
			int end1=ch.length-1;
			
			while (start1<end1) {
				char temp1=ch[start1];
				ch[start1]=ch[end1];
				ch[end1]=temp1;
				start1++;
				end1--;
			}
			
			sa[i]=new String(ch);
					
		}
		System.out.println();
		for (int i = 0; i < sa.length; i++) {
			System.out.print(sa[i]+" ");
		}
		
		
		
	}

}
