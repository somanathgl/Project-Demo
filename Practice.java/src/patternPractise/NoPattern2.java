package patternPractise;

public class NoPattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int cnt=1;
		for(int  i=1;i<=5;i++) {
			
			for(int  j=1;j<=i;j++) {
				//System.out.print(j);
				System.out.print(cnt+++" ");
			}
			System.out.println();
		}
	}

}
