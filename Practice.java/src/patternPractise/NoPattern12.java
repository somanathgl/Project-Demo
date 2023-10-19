package patternPractise;

public class NoPattern12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	1 2 3 4 5
		2 3 4 5
		3 4 5
		4 5
		5
		4 5
		3 4 5
		2 3 4 5
		1 2 3 4 5 */
		
		
         for(int  i=1;i<=5;i++) {
			
			for(int  j=i;j<=5;j++) {
				
				System.out.print(j+" ");
			}
			
			
			System.out.println();
		}
         for(int  i=1;i<=5;i++) {
 			
 			for(int  j=1;j<=5;j++) {
 				if(5<j+i){
 					System.out.print(j+" ");
 				}
 				
 			}
 			
 			
 			System.out.println();
 		}
	}

}
