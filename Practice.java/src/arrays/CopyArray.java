package arrays;

public class CopyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,2,3,4,5,6};
	int b[]=  {a.length};
	int i=0;
		for(int k=0;k<a.length;k++) {
			//System.out.print(a[k]+" ");
			b[i]=a[k];
			System.out.println(b[i]+" ");
		}
		
		//System.out.println(b[i]+" ");
		
	}

}
