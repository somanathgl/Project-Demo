package patternPractise;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

            for(int i=0;i<=4;i++) {
			 
                for(int j=0;j<i;j++) {
                	System.out.print(" ");
                }
                
                for(int j=i;j<=4;j++) {
                	System.out.print("*");
                }
				 System.out.println();
			 }
	}

}
