package String;

public class StartsWithImplementaition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="abcdPriyaabcd";
		String s2="abcd";
		
		if(s2.length()<=s1.length())
		{
			int cnt=0;
			for(int i=0;i<s2.length();i++)
			{
				
					if(s1.charAt(i)==s2.charAt(i))
					{
						cnt++;
					}
				
			}
			if(s2.length()==cnt)
			{
				System.out.println(true);
			}
			else
				System.out.println(false);
		}
	}

}
