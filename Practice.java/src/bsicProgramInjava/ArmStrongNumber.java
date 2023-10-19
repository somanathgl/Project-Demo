package bsicProgramInjava;

public class ArmStrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=157;
		int n=num;
		int length=0;
		//int rem=0;
		
		while(n>0) {
			n=n/10;
			length++;
		}
		
		int n1=num;
		int arm=0;
		int rem=0;
		while(n1>0) {
			rem=n1%10;
			int mul=1;
			for(int i=1;i<=length;i++) {
				mul=mul*rem;
				
				}
			arm=arm+mul;
			n1=n1/10;
		}
		
		if(num==arm) {
			System.out.println("armstrong number");
			
		}
		else
		{
			System.out.println("not armstrong number");
			
		}
		
			
	}

}
