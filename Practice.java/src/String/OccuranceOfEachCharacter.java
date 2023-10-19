package String;

import java.util.HashMap;
import java.util.Map;

public class OccuranceOfEachCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="abcdaabbdcddd";
		String s1="";
		
		for(int i=0;i<s.length();i++) {
			
		      int cnt=0;
			for(int j=0;j<i;j++) {
				
				  if(s.charAt(i)==s.charAt(j)) {
					  cnt++;
					  
				    }
				 
			}
			 if(cnt==0) {
				  s1=s1+s.charAt(i);
				  
			    }
			
		}
		char ca[]=s1.toCharArray();
		int ia[]=new int[ca.length];
		for(int i=0;i<ca.length;i++) {
			char ch=ca[i];
			int cnt=0;
			for(int j=0;j<s.length();j++) {

				  if(s.charAt(j)==ch) {
					  cnt++;
					  
				    }
				  ia[i]=cnt;
			}
			
		}
		for(int i=0;i<ia.length;i++) {
			
			for(int j=i+1;j<ia.length;j++) {
				if(ca[j]<ca[i]) {
					  char temp=ca[i];
					  ca[i]=ca[j];
					  ca[j]=temp;
					  
					  int temp1=ia[i];
					  ia[i]=ia[j];
					  ia[j]=temp1;
					  
			   }
			}
		}
		for(char a:ca) {
			System.out.print(a+" ");
		}
		System.out.println();
		for(int  a:ia) {
			System.out.print(a+" ");
		}
		
		
	}

}
