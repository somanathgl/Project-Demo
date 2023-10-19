package arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class OccuranceOfChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,5,5,5,8,9,5,4,8,4,2};
		
		//int temp=0;
		/*for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}*/
		int b[]=new int[a.length];
		int index=-1;
		
		for(int i=0;i<a.length;i++) {
			
		      int cnt=1;
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					cnt++;
					b[j]=index;
				}
				if(b[i]!=index) {
					b[i]=cnt;
				}
				
			}
		
		}
		for(int i=0;i<b.length;i++) {
			if(b[i]!=index) {
				System.out.print(a[i]+ ":"+b[i]+" ");
			}
			
		}		
		
		Map<Integer,Integer>map=new HashMap<>();
		
		for(int i=0;i<a.length;i++) {
			
			if(map.containsKey(a[i])) {
				
				map.put(a[i],map.get(a[i])+1);
			}
			
			else {
				map.put(a[i], 1);
			}
		}
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			System.out.print(entry.getKey()+":"+entry.getValue()+" ");
		}
			
		
			
			
	}

}
