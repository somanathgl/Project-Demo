package patternPractise;

public class NoPattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	1
		1 2
		1 2 3
		1 2 3 4
		1 2 3 4 5
		1 2 3 4 5 6
		1 2 3 4 5 6 7
		1 2 3 4 5 6
		1 2 3 4 5
		1 2 3 4
		1 2 3
		1 2
		1*/
		
		 for(int i=1;i<=7;i++) {
			 
			 for(int j=1;j<=i;j++) {
				 System.out.print(j+" ");
			 }
				 
			 System.out.println();
			 
		 }
        for(int i=1;i<=7;i++) {
			 
			 for(int j=1;j<=7;j++) {
				 
				if (j+i<=7)
				{
					System.out.print(j+" "); 
				 }
				
				//or System.out.print(j-i+1 +" "); 
				
			 }
				 
			 System.out.println();
			 
		 }
			 
		
	}

}
