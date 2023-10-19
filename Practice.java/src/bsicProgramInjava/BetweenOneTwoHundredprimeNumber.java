package bsicProgramInjava;

public class BetweenOneTwoHundredprimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int start=1;
		int end=100;
       //int cnt=0;
		
		 for(int i=1;i<=100;i++) {
			 int cnt=0;
			 
			 for(int j=2;j<i-1;j++) {
				 if(i%j==0) {
					  
					  cnt++;
				  }
			 }
		
			 if(cnt==0)
			 {
				  
				 System.out.println(i);
			  }
			
			 
	      }
	}

}
