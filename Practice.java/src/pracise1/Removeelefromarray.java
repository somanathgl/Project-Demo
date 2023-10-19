package pracise1;

public class Removeelefromarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]={10,20,30,40,50,60};
		 int ele=90;
		 int cnt=0;
		 int index=0;
		 int b[]=new int[a.length-cnt];
		 for(int i=0;i<a.length;i++){
			 if(a[i]==ele) {
				 System.out.println("found");
				 cnt++;
				// break;
			 }
			 if(a[i]!=ele) {
				b[index++]=a[i];
			 }
			 
		 }
	
		 if(cnt==0) {
			 System.out.println("not found");
			// break;
		 }
		 for(int i=0;i<b.length;i++){
			 System.out.print(b[i]+" ");
		 }
		 
	}
  }

