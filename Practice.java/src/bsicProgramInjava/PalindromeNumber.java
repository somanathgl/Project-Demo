package bsicProgramInjava;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=123;
		int n=num;
		int rem=0;
		int sum=0;
		while(n>0) {
			rem=n%10;
			sum=sum*10+rem;
			n=n/10;
			
		}
		if(sum==num) {
			System.out.println("palindrome number");
		}
		else
		{
			System.out.println("not palindrome");
		}
		
	}

}
