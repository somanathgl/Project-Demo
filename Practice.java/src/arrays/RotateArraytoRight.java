package arrays;

public class RotateArraytoRight {

	public static void main(String[] args) {
		// Array Rotate Right
        /*     int a[]= {1,2,3,4,5,6};
              int temp=a[a.length-1];
              
              for(int i=a.length-1;i>0;i--)
              {
            	  a[i]=a[i-1];
              }
              a[0]=temp;
              
              for(int k=0;k<a.length;k++)
              System.out.println(a[k]);
              
              
        /*     int a[]= {1,2,3,4,5,6};
              int temp=a[a.length-1];
              for(int i=a.length-1;i<=0;i--) {
            	  
            	  a[i-1]=a[i];
              }
              a[0]=temp;*/
		
		//Array Rotate Left
              
		int a[]= {11,22,35,47,52,63,74,87};
		int temp=a[0];
		for(int i=0;i<a.length-1;i++)
		{
			a[i]=a[i+1];
		}
		a[a.length-1]=temp;
		for(int k=0;k<a.length;k++)
		{
			System.out.print(a[k]+" ");
		}
			
              
	}

}
