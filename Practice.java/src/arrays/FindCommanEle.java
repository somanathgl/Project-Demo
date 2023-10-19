package arrays;

import java.util.ArrayList;

public class FindCommanEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {2,4,8};
		int b[]= {2,3,4,8,10,16};
		int c[]= {2,8,14,40};
		
		ArrayList al=new ArrayList ();
		int x=0 , y=0,z=0;
		
		while(x<a.length && y<b.length && z<c.length) {
			if(a[x]== b[y] && b[y]==c[z]) {
				al.add(a[x]);
				x++;
				y++;
				z++;
			}
			else if(a[x]<b[y]) {
				x++;
			}
			else if(b[y]<c[z]) {
				y++;
			}
			else {
				z++;
			}
		}
		System.out.print(al+" ");
	}

}
