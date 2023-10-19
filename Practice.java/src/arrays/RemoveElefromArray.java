package arrays;

public class RemoveElefromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]={10,20,30,40,50,60};
		 int ele=20;
		 int cnt=0;
		// int j=0;
		 for(int i=0;i<a.length;i++)
			{
			  if(a[i]==ele)
				{
				  for(int j=i;j<a.length-1;j++)
				  {
					  
					  a[j]=a[j+1];
					  cnt++;
				  }
				  System.out.println("Removed");
				  break;
			 
			  }
			 
	    	}
		 if(cnt==0) {
			 System.out.println("element not found");
		 }
			
	}

}
