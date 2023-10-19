package bsicProgramInjava;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=123;
		
		int rem=0;
		int sum=0;
		while(num>0) {
			rem=num%10;
			sum=rem+(sum*10);
			num=num/10;
			
			
			
		}
		System.out.println(sum);
		
	}

}
