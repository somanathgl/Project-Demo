package bsicProgramInjava;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=5;
		int cnt=0;
		  for(int  i=2;i<num;i++) {
			  if(num%i==0) {
				  cnt++;
			  }
			  
		  }
		  if(cnt==0) {
			  System.out.println("prime number");
		  }
		  else
		  {
			  System.out.println("not prime number");
		  }
	}

}
