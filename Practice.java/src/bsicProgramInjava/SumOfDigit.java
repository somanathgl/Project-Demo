package bsicProgramInjava;

public class SumOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=123;
		int n=num;
		int rem=0;
		int sum=0;
		int cnt=0;
		while(0<n) {
			rem=n%10;
			cnt++;
			sum=sum+rem;
			n=n/10;
		}
		System.out.println("Sum of digit ="
				+ " "+sum);
	}

}
