package arrays;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {41,42,43,44,45,46,47};
		
		int ele=45;
		int start=0;
		int end=a.length-1;
		
		int mid=(start+end)/2;
		
		while(start<=end) {
			if(ele==a[mid]) {
				System.out.println("ele found at index = "+mid);
				break;
			}
			else if(ele>a[mid]) {
				start=mid+1;
			}
			else {
				end=mid-1;
			}
			mid=(start+end)/2;

		}
		if(start>end) {
			System.out.println("ele not found");
		}
	}

}
