package patternPractise;

public class Pattern11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		 for(int i=0;i<=4;i++) {
			 
			 for(int j=0;j<=i;j++) {
				 
				 if(j-i==0) {
					 System.out.print("*");
				 }
				 System.out.print(" ");
			 }
			 
			 System.out.println();
				 
		 }
	}

}
