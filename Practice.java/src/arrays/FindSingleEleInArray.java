package arrays;

public class FindSingleEleInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {5,5,3,3,2,1,6,1,6};
		
		int res=a[0];
		for(int  i=1;i<a.length;i++) {
			res=res^a[i];
			
		}
		System.out.println(res);
	}

}
