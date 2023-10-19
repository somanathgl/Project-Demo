package arrays;

public class MergeTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,3,5,7};
		int b[]= {2,4,6,8};
		int c[]=new int[a.length+b.length];
		
		int index=0;
		for(int i=0;i<a.length;i++){
			c[index++]=a[i];
			
		}
		for(int i=0;i<b.length;i++){
			c[index++]=b[i];
			
		}
		for(int i=0;i<c.length;i++){
			System.out.print(c[i]+" ");
			
		}
		System.out.println();
		
		//SecondWay
		 int j=0;
		for(int i=0;i<c.length;i++){
			if(i<a.length){
				c[j++]=a[i];
			}
			if(i<b.length){
				c[j++]=b[i];
			}
			
	   }
		for(int i=0;i<c.length;i++){
			System.out.print(c[i]+" ");
		}
		
				
	}

}
