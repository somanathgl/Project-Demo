package patternPractise;

public class NoPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //int cnt=1;
		
		for(int  i=1;i<=5;i++) {
			
			int cnt=i;
			for(int  j=1;j<=i;j++) {
				
								
				System.out.print(cnt+" ");
				
				cnt=cnt+5-j;
				
			}
			
			System.out.println();
		}
	}

}
