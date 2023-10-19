package patternPractise;

public class NoPattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	1
		2 1 2
		3 2 1 2 3
		4 3 2 1 2 3 4
*/		
		
		
		for(int  i=1;i<=4;i++) {
			
			for(int  j=i;1<=j;j--) {
				System.out.print(j);
			}
			for(int  j=2;j<=i;j++) {
				System.out.print(j);
			}
			
			System.out.println();
		}
	}

}
