package arrays;

public class CoinChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int coin[]= {1,5,6};
		int amount=11;
		
		int a[]=new int[amount+1];
		a[0]=1;
		int cnt=0;
		for(int i=0;i<a.length;i++) {
			
			for(int j=i;j<a.length;j++) {
				a[j]=a[j]+a[j-i];
				cnt++;
			}
			
		}
		System.out.println(cnt);
	}

}
