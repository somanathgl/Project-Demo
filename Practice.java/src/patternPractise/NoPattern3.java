package patternPractise;

public class NoPattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int  i=1;i<=5;i++) {
			
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			for(int j=i-1;1<=j;j--) {
				System.out.print(j);
			}
			
			
			System.out.println();
		}
	}

}
