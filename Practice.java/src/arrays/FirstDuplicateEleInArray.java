package arrays;

import java.util.HashSet;

public class FirstDuplicateEleInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		int a[]= {5,4,3,2,4,6,};
		HashSet<Integer>hs=new HashSet<>();
	/*	for(int  i=0;i<a.length-1;i++) {
			
			  int cnt=0;
			for(int  j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.println(a[i]);
					cnt++;
					break;
				}
			}
			if(cnt>0) {
				break;
			}
			
		}*/
			
		int index=-1;
		for(int  i=0;i<a.length;i++) {
		if(hs.contains(a[i])) {
			index=i;
		}
		else {
			hs.add(a[i]);
		}
		
		}
		
		
		if (-1!=index) {
			System.out.print(a[index]+" ");
	      }
	}
		
 }


