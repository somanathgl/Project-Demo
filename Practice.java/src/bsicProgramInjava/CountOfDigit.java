package bsicProgramInjava;

public class CountOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		int num=125;
		int cnt=0;
		while(0<num) {
			num=num/10;
			cnt++;
		}
		System.out.println("Count of digit = "+cnt);
			
			
	}

}
