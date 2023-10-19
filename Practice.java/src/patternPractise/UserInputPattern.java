package patternPractise;

import java.util.Scanner;

public class UserInputPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter the lenth of Pattern : ");
		int lenght=sc.nextInt();
		System.out.println("Pattern Length = "+lenght);
		
		pattern(lenght);
		
	}
	    public static void pattern(int length) {
		
	    	for(int  i=1;i<=length;i++) {
	    		
	    		for(int  j=i;1<=j;j--) {
	    			System.out.print(j);
	    			System.out.print(" ");
	    		}
	    		
	    		System.out.println();
	    	}
	    
	  
   }
}
