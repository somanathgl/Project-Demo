package patternPractise;

public class NoPattern11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	1
		2 1
		3 2 1
		4 3 2 1
		5 4 3 2 1*/
		
        for(int  i=1;i<=5;i++) {
			
			for(int  j=i;1<=j;j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}
