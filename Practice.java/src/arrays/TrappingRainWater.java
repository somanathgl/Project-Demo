package arrays;

public class TrappingRainWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {3,1,2,4,0,1,3,2};
		
		int lt[]=new int[a.length];
		int rt[]=new int[a.length];
		
		lt[0]=a[0];
		for(int i=1;i<a.length;i++){
			lt[i]=Math.min(lt[i-1], a[i]);
		}
		rt[a.length-1]=a[a.length-1];
		for(int i=a.length-1;0<=i;i--){
			rt[a.length-1]=Math.min(rt[i], a[i]);
		}
		int ans=0;
		for(int i=0;i<a.length;i++){
			ans=ans+Math.max(lt[i], rt[i] -(a[i]));
		}
		System.out.println(ans);
	}

}

