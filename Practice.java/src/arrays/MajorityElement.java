package arrays;

public class MajorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {3,3,4,2,4,4,2,4,4,4};
		
		int count=0;
		int index=-1;
		for(int i=0;i<a.length;i++) {
			int cnt=0;
			
			for(int j=i+1;j<a.length;j++) {
				
				if(a[i]==a[j]) {
					cnt++;
				}
				if(count<cnt) {
					count=cnt;
					index=i;
					
			}
				
		}
			
	 }
		if((a[a.length/2])<count) {
			System.out.println(a[index]);
		}
		else {
			System.out.println("no majority element");
		}
		
	}
}
