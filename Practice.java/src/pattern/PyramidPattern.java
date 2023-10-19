package pattern;

import java.util.Scanner;

public class PyramidPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	//Scanner sc=new Scanner(System.in);
		//System.out.println("Enter  i value ");       *
		                                              * *
		                                             * * *
		                                            * *  * **/
		
		
		   for(int i=1; i<=4;i++) {
			
			
			for(int j=4; i<=j;j--) {
				if(i==2  && 2<j && j<4){
				System.out.print(j+5);
				
				}
				else {
					System.out.print(j);
				}
					
				
				
			}
			
			System.out.println(" ");
		
		}
			
	}

}
