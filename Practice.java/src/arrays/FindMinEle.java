package arrays;

public class FindMinEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int a[]= {5,9,8,8,77,55,2,40};
		
		int min=a[0];
		for(int  i=0;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
			
		}
		System.out.println(min);
	}

}
