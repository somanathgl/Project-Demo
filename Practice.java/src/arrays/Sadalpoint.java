package arrays;

public class Sadalpoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][]= {{1,5,6},
			    {9,7,8},
	            {7,4,3}};
		 int cnt=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				int min=Integer.MAX_VALUE;
				for(int k=0;k<a.length;k++)
				{
					if(a[i][k]<min){
						min=a[i][k];
					}
					
						
				}
				int max=Integer.MIN_VALUE;
				for(int k=0;k<a.length;k++)
				{
					if(a[k][j]>max){
						max=a[k][j];
					}
					
						
				}
				if(max==min){
					cnt++;
					System.out.println(a[i][j]);
				}
				
			}
		}
		if(cnt==0){
			System.out.println("no saddle point");
		}
	}

}
	/*	int cnt=0;
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a.length; j++)
			{
				int min=Integer.MAX_VALUE;
				for (int k = 0; k < a.length; k++) 
				{
					if(a[i][k]<min)
					{
						min=a[i][k];
					}
					
				}
				int max=Integer.MIN_VALUE;
				for(int k=0;k<a.length;k++)
				{
					if(a[k][j]>max)
					{
						max=a[k][j];
					}
				}
				if(min==max)
				{
					cnt++;
					System.out.println(a[i][j]);
				
				}
			}
			
		}
		if(cnt==0)
		{
			System.out.println("no saddle point");
		}
			}

	}*/

