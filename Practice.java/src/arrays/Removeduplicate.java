package arrays;

public class Removeduplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a[]= {1,2,3,2,5,6};
      
        int cnt=0;
        for(int i=0;i<a.length-1;i++)
        {
        	 for(int j=i+1;j<a.length-1;j++)
             {
        	     if(a[i]==a[j] )
        	 {
        		  cnt++;
        	 }
        	
        
	           }
        }	 
        
        	 int b[]=new int[a.length-1];
        	 int index=0;
        	 for(int i=0;i<a.length;i++)
             { int count=0;
             	 for(int j=0;j<i;j++)
                  {
             	     if(a[i]==a[j] )
             	      {
             		  cnt++;
             	     }
                  }
             	if(count==0)
            	{
            		b[index++]=a[i];
            	}
            	
             } 
        	 
           
        	 
        	 
        for (int i=0;i<b.length;i++) {
        	System.out.print(b[i]+" ");
        }
     }
}   


